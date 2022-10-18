package typings.sucrase

import typings.sucrase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilGetJSXPragmaInfoMod {
  
  @JSImport("sucrase/dist/types/util/getJSXPragmaInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): JSXPragmaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[JSXPragmaInfo]
  
  trait JSXPragmaInfo extends StObject {
    
    var base: String
    
    var fragmentBase: String
    
    var fragmentSuffix: String
    
    var suffix: String
  }
  object JSXPragmaInfo {
    
    inline def apply(base: String, fragmentBase: String, fragmentSuffix: String, suffix: String): JSXPragmaInfo = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], fragmentBase = fragmentBase.asInstanceOf[js.Any], fragmentSuffix = fragmentSuffix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSXPragmaInfo]
    }
    
    extension [Self <: JSXPragmaInfo](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setFragmentBase(value: String): Self = StObject.set(x, "fragmentBase", value.asInstanceOf[js.Any])
      
      inline def setFragmentSuffix(value: String): Self = StObject.set(x, "fragmentSuffix", value.asInstanceOf[js.Any])
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
}
