package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  /**
    * (ID of a file) An icon for the account. Must be square and at
    * least 128px x 128px.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * (ID of a file) A logo for the account that will be used in
    * Checkout instead of the icon and without the account’s name next to it
    * if provided. Must be at least 128px x 128px. This can be unset by
    * updating the value to null and then saving.
    */
  var logo: js.UndefOr[String] = js.undefined
  
  /**
    * A CSS hex color value representing the primary branding color for this account.
    */
  var primary_color: js.UndefOr[String] = js.undefined
}
object Icon {
  
  inline def apply(): Icon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setPrimary_color(value: String): Self = StObject.set(x, "primary_color", value.asInstanceOf[js.Any])
    
    inline def setPrimary_colorUndefined: Self = StObject.set(x, "primary_color", js.undefined)
  }
}
