package typings.umd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(name: String, src: String): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(name: String, src: String, options: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(name: String, src: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("umd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def postlude(moduleName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("postlude")(moduleName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def postlude(moduleName: String, options: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("postlude")(moduleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def postlude(moduleName: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("postlude")(moduleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def prelude(moduleName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prelude")(moduleName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def prelude(moduleName: String, options: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prelude")(moduleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def prelude(moduleName: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prelude")(moduleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var commonJS: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCommonJS(value: Boolean): Self = StObject.set(x, "commonJS", value.asInstanceOf[js.Any])
      
      inline def setCommonJSUndefined: Self = StObject.set(x, "commonJS", js.undefined)
    }
  }
}
