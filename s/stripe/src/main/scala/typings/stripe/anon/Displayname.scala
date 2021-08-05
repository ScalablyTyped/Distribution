package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Displayname extends StObject {
  
  /**
    * The display name for this account. This is used on the Stripe Dashboard to
    * differentiate between accounts.
    */
  var display_name: js.UndefOr[String] = js.undefined
  
  /**
    * The timezone used in the Stripe Dashboard for this account. A list of
    * possible time zone values is maintained at the IANA Time Zone Database.
    */
  var timezone: js.UndefOr[String] = js.undefined
}
object Displayname {
  
  inline def apply(): Displayname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Displayname]
  }
  
  extension [Self <: Displayname](x: Self) {
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
