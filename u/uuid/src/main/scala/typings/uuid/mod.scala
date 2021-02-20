package typings.uuid

import typings.std.ArrayLike
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSImport("uuid", "v1")
  @js.native
  val v1: typings.uuid.mod.v1 = js.native
  type v1 = v1Buffer with v1String
  
  @JSImport("uuid", "v3")
  @js.native
  val v3: typings.uuid.mod.v3 = js.native
  type v3 = v3Buffer with v3String with v3Static
  
  @JSImport("uuid", "v4")
  @js.native
  val v4: typings.uuid.mod.v4 = js.native
  type v4 = v4Buffer with v4String
  
  @JSImport("uuid", "v5")
  @js.native
  val v5: typings.uuid.mod.v5 = js.native
  type v5 = v5Buffer with v5String with v5Static
  
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
  
  @js.native
  trait RandomOptions extends V4Options {
    
    var random: js.UndefOr[InputBuffer] = js.native
  }
  object RandomOptions {
    
    @scala.inline
    def apply(): RandomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomOptions]
    }
    
    @scala.inline
    implicit class RandomOptionsMutableBuilder[Self <: RandomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRandom(value: InputBuffer): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
    }
  }
  
  @js.native
  trait RngOptions extends V4Options {
    
    var rng: js.UndefOr[js.Function0[InputBuffer]] = js.native
  }
  object RngOptions {
    
    @scala.inline
    def apply(): RngOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RngOptions]
    }
    
    @scala.inline
    implicit class RngOptionsMutableBuilder[Self <: RngOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRng(value: () => InputBuffer): Self = StObject.set(x, "rng", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRngUndefined: Self = StObject.set(x, "rng", js.undefined)
    }
  }
  
  @js.native
  trait V1BaseOptions extends StObject {
    
    var clockseq: js.UndefOr[Double] = js.native
    
    var msecs: js.UndefOr[Double | Date] = js.native
    
    var node: js.UndefOr[InputBuffer] = js.native
    
    var nsecs: js.UndefOr[Double] = js.native
  }
  object V1BaseOptions {
    
    @scala.inline
    def apply(): V1BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[V1BaseOptions]
    }
    
    @scala.inline
    implicit class V1BaseOptionsMutableBuilder[Self <: V1BaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClockseq(value: Double): Self = StObject.set(x, "clockseq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockseqUndefined: Self = StObject.set(x, "clockseq", js.undefined)
      
      @scala.inline
      def setMsecs(value: Double | Date): Self = StObject.set(x, "msecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsecsUndefined: Self = StObject.set(x, "msecs", js.undefined)
      
      @scala.inline
      def setNode(value: InputBuffer): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNsecsUndefined: Self = StObject.set(x, "nsecs", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.uuid.mod.V1RandomOptions
    - typings.uuid.mod.V1RngOptions
  */
  trait V1Options extends StObject
  object V1Options {
    
    @scala.inline
    def V1RandomOptions(): typings.uuid.mod.V1RandomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uuid.mod.V1RandomOptions]
    }
    
    @scala.inline
    def V1RngOptions(): typings.uuid.mod.V1RngOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uuid.mod.V1RngOptions]
    }
  }
  
  @js.native
  trait V1RandomOptions
    extends RandomOptions
       with V1BaseOptions
       with V1Options
  object V1RandomOptions {
    
    @scala.inline
    def apply(): V1RandomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[V1RandomOptions]
    }
  }
  
  @js.native
  trait V1RngOptions
    extends RngOptions
       with V1BaseOptions
       with V1Options
  object V1RngOptions {
    
    @scala.inline
    def apply(): V1RngOptions = {
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
    
    @scala.inline
    def RandomOptions(): typings.uuid.mod.RandomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uuid.mod.RandomOptions]
    }
    
    @scala.inline
    def RngOptions(): typings.uuid.mod.RngOptions = {
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
  
  @js.native
  trait v3Static extends StObject {
    
    // https://github.com/uuidjs/uuid/blob/master/src/v35.js#L22
    var DNS: String = js.native
    
    // https://github.com/uuidjs/uuid/blob/master/src/v35.js#L23
    var URL: String = js.native
  }
  object v3Static {
    
    @scala.inline
    def apply(DNS: String, URL: String): v3Static = {
      val __obj = js.Dynamic.literal(DNS = DNS.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
      __obj.asInstanceOf[v3Static]
    }
    
    @scala.inline
    implicit class v3StaticMutableBuilder[Self <: v3Static] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDNS(value: String): Self = StObject.set(x, "DNS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait v5Static extends StObject {
    
    // https://github.com/uuidjs/uuid/blob/master/src/v35.js#L22
    var DNS: String = js.native
    
    // https://github.com/uuidjs/uuid/blob/master/src/v35.js#L23
    var URL: String = js.native
  }
  object v5Static {
    
    @scala.inline
    def apply(DNS: String, URL: String): v5Static = {
      val __obj = js.Dynamic.literal(DNS = DNS.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
      __obj.asInstanceOf[v5Static]
    }
    
    @scala.inline
    implicit class v5StaticMutableBuilder[Self <: v5Static] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDNS(value: String): Self = StObject.set(x, "DNS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
  
  type v5String = js.Function2[/* name */ String | InputBuffer, /* namespace */ String | InputBuffer, String]
}
