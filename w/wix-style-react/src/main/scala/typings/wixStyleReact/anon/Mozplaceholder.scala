package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mozplaceholder extends StObject {
  
  @JSName("&:-moz-placeholder")
  var `AmpersandColon-moz-placeholder`: Color
  
  @JSName("&:-ms-input-placeholder")
  var `AmpersandColon-ms-input-placeholder`: ColorString
  
  @JSName("&::-moz-placeholder")
  var `AmpersandColonColon-moz-placeholder`: Color
  
  @JSName("&::-webkit-input-placeholder")
  var `AmpersandColonColon-webkit-input-placeholder`: Color
}
object Mozplaceholder {
  
  inline def apply(
    `AmpersandColon-moz-placeholder`: Color,
    `AmpersandColon-ms-input-placeholder`: ColorString,
    `AmpersandColonColon-moz-placeholder`: Color,
    `AmpersandColonColon-webkit-input-placeholder`: Color
  ): Mozplaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("&:-moz-placeholder")(`AmpersandColon-moz-placeholder`.asInstanceOf[js.Any])
    __obj.updateDynamic("&:-ms-input-placeholder")(`AmpersandColon-ms-input-placeholder`.asInstanceOf[js.Any])
    __obj.updateDynamic("&::-moz-placeholder")(`AmpersandColonColon-moz-placeholder`.asInstanceOf[js.Any])
    __obj.updateDynamic("&::-webkit-input-placeholder")(`AmpersandColonColon-webkit-input-placeholder`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mozplaceholder]
  }
  
  extension [Self <: Mozplaceholder](x: Self) {
    
    inline def `setAmpersandColon-moz-placeholder`(value: Color): Self = StObject.set(x, "&:-moz-placeholder", value.asInstanceOf[js.Any])
    
    inline def `setAmpersandColon-ms-input-placeholder`(value: ColorString): Self = StObject.set(x, "&:-ms-input-placeholder", value.asInstanceOf[js.Any])
    
    inline def `setAmpersandColonColon-moz-placeholder`(value: Color): Self = StObject.set(x, "&::-moz-placeholder", value.asInstanceOf[js.Any])
    
    inline def `setAmpersandColonColon-webkit-input-placeholder`(value: Color): Self = StObject.set(x, "&::-webkit-input-placeholder", value.asInstanceOf[js.Any])
  }
}
