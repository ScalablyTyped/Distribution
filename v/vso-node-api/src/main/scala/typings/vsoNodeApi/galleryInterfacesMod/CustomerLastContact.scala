package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerLastContact extends StObject {
  
  /**
    * account for which customer was last contacted
    */
  var account: String
  
  /**
    * Date on which the custoemr was last contacted
    */
  var lastContactDate: Date
}
object CustomerLastContact {
  
  inline def apply(account: String, lastContactDate: Date): CustomerLastContact = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], lastContactDate = lastContactDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerLastContact]
  }
  
  extension [Self <: CustomerLastContact](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setLastContactDate(value: Date): Self = StObject.set(x, "lastContactDate", value.asInstanceOf[js.Any])
  }
}
