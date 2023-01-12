package typings.styleToJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUtilitiesMod {
  
  @JSImport("style-to-js/cjs/utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelCase(property: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(property.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def camelCase(property: String, options: CamelCaseOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(property.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait CamelCaseOptions extends StObject {
    
    var reactCompat: js.UndefOr[Boolean] = js.undefined
  }
  object CamelCaseOptions {
    
    inline def apply(): CamelCaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CamelCaseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CamelCaseOptions] (val x: Self) extends AnyVal {
      
      inline def setReactCompat(value: Boolean): Self = StObject.set(x, "reactCompat", value.asInstanceOf[js.Any])
      
      inline def setReactCompatUndefined: Self = StObject.set(x, "reactCompat", js.undefined)
    }
  }
}
