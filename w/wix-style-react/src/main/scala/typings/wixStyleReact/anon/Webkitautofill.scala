package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Webkitautofill extends StObject {
  
  @JSName("&:-webkit-autofill")
  var `AmpersandColon-webkit-autofill`: BorderRadiusAny
  
  var borderRadius: Any
}
object Webkitautofill {
  
  inline def apply(`AmpersandColon-webkit-autofill`: BorderRadiusAny, borderRadius: Any): Webkitautofill = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any])
    __obj.updateDynamic("&:-webkit-autofill")(`AmpersandColon-webkit-autofill`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webkitautofill]
  }
  
  extension [Self <: Webkitautofill](x: Self) {
    
    inline def `setAmpersandColon-webkit-autofill`(value: BorderRadiusAny): Self = StObject.set(x, "&:-webkit-autofill", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: Any): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
  }
}
