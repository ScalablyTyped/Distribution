package typings.uuid

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuid", "NIL")
  @js.native
  val NIL: typings.uuid.mod.NIL = js.native
  type NIL = String
  
  @JSImport("uuid", "parse")
  @js.native
  val parse: typings.uuid.mod.parse = js.native
  type parse = js.Function1[/* uuid */ String, OutputBuffer]
  
  @JSImport("uuid", "stringify")
  @js.native
  val stringify: typings.uuid.mod.stringify = js.native
  type stringify = js.Function2[/* buffer */ InputBuffer, /* offset */ js.UndefOr[Double], String]
  
  @js.native
  trait v1
    extends v1Buffer
       with v1String {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* options */ js.UndefOr[V1Options]): String = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* options */ js.UndefOr[V1Options | Null],
      arg2: /* buffer */ OutputBuffer,
      arg3: /* offset */ js.UndefOr[Double]
    ): OutputBuffer = js.native
  }
  @JSImport("uuid", "v1")
  @js.native
  val v1: typings.uuid.mod.v1 = js.native
  
  @js.native
  trait v3
    extends v3Buffer
       with v3String
       with v3Static {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* name */ String | InputBuffer, arg2: /* namespace */ String | InputBuffer): String = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* name */ String | InputBuffer,
      arg2: /* namespace */ String | InputBuffer,
      arg3: /* buffer */ OutputBuffer,
      arg4: /* offset */ js.UndefOr[Double]
    ): OutputBuffer = js.native
  }
  @JSImport("uuid", "v3")
  @js.native
  val v3: typings.uuid.mod.v3 = js.native
  
  @js.native
  trait v4
    extends v4Buffer
       with v4String {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* options */ js.UndefOr[V4Options]): String = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* options */ js.UndefOr[V4Options | Null],
      arg2: /* buffer */ OutputBuffer,
      arg3: /* offset */ js.UndefOr[Double]
    ): OutputBuffer = js.native
  }
  @JSImport("uuid", "v4")
  @js.native
  val v4: typings.uuid.mod.v4 = js.native
  
  @js.native
  trait v5
    extends v5Buffer
       with v5String
       with v5Static {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* name */ String | InputBuffer, arg2: /* namespace */ String | InputBuffer): String = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* name */ String | InputBuffer,
      arg2: /* namespace */ String | InputBuffer,
      arg3: /* buffer */ OutputBuffer,
      arg4: /* offset */ js.UndefOr[Double]
    ): OutputBuffer = js.native
  }
  @JSImport("uuid", "v5")
  @js.native
  val v5: typings.uuid.mod.v5 = js.native
  
  @JSImport("uuid", "validate")
  @js.native
  val validate: typings.uuid.mod.validate = js.native
  type validate = js.Function1[/* uuid */ String, Boolean]
  
  @JSImport("uuid", "version")
  @js.native
  val version: typings.uuid.mod.version = js.native
  type version = js.Function1[/* uuid */ String, Double]
  
  type InputBuffer = ArrayLike[Double]
  
  // Uses ArrayLike to admit Unit8 and co.
  type OutputBuffer = ArrayLike[Double]
  
  trait RandomOptions
    extends StObject
       with V4Options {
    
    var random: js.UndefOr[InputBuffer] = js.undefined
  }
  object RandomOptions {
    
    inline def apply(): RandomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomOptions]
    }
    
    extension [Self <: RandomOptions](x: Self) {
      
      inline def setRandom(value: InputBuffer): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
    }
  }
  
  trait RngOptions
    extends StObject
       with V4Options {
    
    var rng: js.UndefOr[js.Function0[InputBuffer]] = js.undefined
  }
  object RngOptions {
    
    inline def apply(): RngOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RngOptions]
    }
    
    extension [Self <: RngOptions](x: Self) {
      
      inline def setRng(value: () => InputBuffer): Self = StObject.set(x, "rng", js.Any.fromFunction0(value))
      
      inline def setRngUndefined: Self = StObject.set(x, "rng", js.undefined)
    }
  }
  
  trait V1BaseOptions extends StObject {
    
    var clockseq: js.UndefOr[Double] = js.undefined
    
    var msecs: js.UndefOr[Double | js.Date] = js.undefined
    
    var node: js.UndefOr[InputBuffer] = js.undefined
    
    var nsecs: js.UndefOr[Double] = js.undefined
  }
  object V1BaseOptions {
    
    inline def apply(): V1BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[V1BaseOptions]
    }
    
    extension [Self <: V1BaseOptions](x: Self) {
      
      inline def setClockseq(value: Double): Self = StObject.set(x, "clockseq", value.asInstanceOf[js.Any])
      
      inline def setClockseqUndefined: Self = StObject.set(x, "clockseq", js.undefined)
      
      inline def setMsecs(value: Double | js.Date): Self = StObject.set(x, "msecs", value.asInstanceOf[js.Any])
      
      inline def setMsecsUndefined: Self = StObject.set(x, "msecs", js.undefined)
      
      inline def setNode(value: InputBuffer): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
      
      inline def setNsecsUndefined: Self = StObject.set(x, "nsecs", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.uuid.mod.V1RandomOptions
    - typings.uuid.mod.V1RngOptions
  */
  trait V1Options extends StObject
  object V1Options {
    
    inline def V1RandomOptions(): typings.uuid.mod.V1RandomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uuid.mod.V1RandomOptions]
    }
    
    inline def V1RngOptions(): typings.uuid.mod.V1RngOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uuid.mod.V1RngOptions]
    }
  }
  
  trait V1RandomOptions
    extends StObject
       with V1BaseOptions
       with RandomOptions
       with V1Options
  object V1RandomOptions {
    
    inline def apply(): V1RandomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[V1RandomOptions]
    }
  }
  
  trait V1RngOptions
    extends StObject
       with V1BaseOptions
       with RngOptions
       with V1Options
  object V1RngOptions {
    
    inline def apply(): V1RngOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[V1RngOptions]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.uuid.mod.RandomOptions
    - typings.uuid.mod.RngOptions
  */
  trait V4Options extends StObject
  object V4Options {
    
    inline def RandomOptions(): typings.uuid.mod.RandomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uuid.mod.RandomOptions]
    }
    
    inline def RngOptions(): typings.uuid.mod.RngOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uuid.mod.RngOptions]
    }
  }
  
  type v1Buffer = js.Function3[
    /* options */ js.UndefOr[V1Options | Null], 
    /* buffer */ OutputBuffer, 
    /* offset */ js.UndefOr[Double], 
    OutputBuffer
  ]
  
  type v1String = js.Function1[/* options */ js.UndefOr[V1Options], String]
  
  type v3Buffer = js.Function4[
    /* name */ String | InputBuffer, 
    /* namespace */ String | InputBuffer, 
    /* buffer */ OutputBuffer, 
    /* offset */ js.UndefOr[Double], 
    OutputBuffer
  ]
  
  trait v3Static extends StObject {
    
    // https://github.com/uuidjs/uuid/blob/master/src/v35.js#L22
    var DNS: String
    
    // https://github.com/uuidjs/uuid/blob/master/src/v35.js#L23
    var URL: String
  }
  object v3Static {
    
    inline def apply(DNS: String, URL: String): v3Static = {
      val __obj = js.Dynamic.literal(DNS = DNS.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
      __obj.asInstanceOf[v3Static]
    }
    
    extension [Self <: v3Static](x: Self) {
      
      inline def setDNS(value: String): Self = StObject.set(x, "DNS", value.asInstanceOf[js.Any])
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
  
  type v3String = js.Function2[/* name */ String | InputBuffer, /* namespace */ String | InputBuffer, String]
  
  type v4Buffer = js.Function3[
    /* options */ js.UndefOr[V4Options | Null], 
    /* buffer */ OutputBuffer, 
    /* offset */ js.UndefOr[Double], 
    OutputBuffer
  ]
  
  type v4String = js.Function1[/* options */ js.UndefOr[V4Options], String]
  
  type v5Buffer = js.Function4[
    /* name */ String | InputBuffer, 
    /* namespace */ String | InputBuffer, 
    /* buffer */ OutputBuffer, 
    /* offset */ js.UndefOr[Double], 
    OutputBuffer
  ]
  
  trait v5Static extends StObject {
    
    // https://github.com/uuidjs/uuid/blob/master/src/v35.js#L22
    var DNS: String
    
    // https://github.com/uuidjs/uuid/blob/master/src/v35.js#L23
    var URL: String
  }
  object v5Static {
    
    inline def apply(DNS: String, URL: String): v5Static = {
      val __obj = js.Dynamic.literal(DNS = DNS.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
      __obj.asInstanceOf[v5Static]
    }
    
    extension [Self <: v5Static](x: Self) {
      
      inline def setDNS(value: String): Self = StObject.set(x, "DNS", value.asInstanceOf[js.Any])
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
  
  type v5String = js.Function2[/* name */ String | InputBuffer, /* namespace */ String | InputBuffer, String]
}
