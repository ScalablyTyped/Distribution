package typings.uuidWithV6

import typings.uuidWithV6.anon.PartialV6SetupOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuid-with-v6", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("uuid-with-v6", "NIL")
  @js.native
  val NIL: typings.uuid.mod.NIL = js.native
  
  @JSImport("uuid-with-v6", "parse")
  @js.native
  val parse: typings.uuid.mod.parse = js.native
  
  @JSImport("uuid-with-v6", "stringify")
  @js.native
  val stringify: typings.uuid.mod.stringify = js.native
  
  @JSImport("uuid-with-v6", "v1")
  @js.native
  val v1: typings.uuid.mod.v1 = js.native
  
  @JSImport("uuid-with-v6", "v3")
  @js.native
  val v3: typings.uuid.mod.v3 = js.native
  
  @JSImport("uuid-with-v6", "v4")
  @js.native
  val v4: typings.uuid.mod.v4 = js.native
  
  @JSImport("uuid-with-v6", "v5")
  @js.native
  val v5: typings.uuid.mod.v5 = js.native
  
  inline def v6(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v6")().asInstanceOf[String]
  
  inline def v6setup(): js.Function0[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("v6setup")().asInstanceOf[js.Function0[String]]
  inline def v6setup(opts: PartialV6SetupOpts): js.Function0[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("v6setup")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function0[String]]
  
  @JSImport("uuid-with-v6", "validate")
  @js.native
  val validate: typings.uuid.mod.validate = js.native
  
  @JSImport("uuid-with-v6", "version")
  @js.native
  val version: typings.uuid.mod.version = js.native
  
  trait V6SetupOpts extends StObject {
    
    var disableRandom: Boolean
  }
  object V6SetupOpts {
    
    inline def apply(disableRandom: Boolean): V6SetupOpts = {
      val __obj = js.Dynamic.literal(disableRandom = disableRandom.asInstanceOf[js.Any])
      __obj.asInstanceOf[V6SetupOpts]
    }
    
    extension [Self <: V6SetupOpts](x: Self) {
      
      inline def setDisableRandom(value: Boolean): Self = StObject.set(x, "disableRandom", value.asInstanceOf[js.Any])
    }
  }
}
