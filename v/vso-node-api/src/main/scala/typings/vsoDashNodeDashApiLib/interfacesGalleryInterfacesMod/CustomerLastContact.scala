package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerLastContact extends js.Object {
  /**
    * account for which customer was last contacted
    */
  var account: java.lang.String
  /**
    * Date on which the custoemr was last contacted
    */
  var lastContactDate: stdLib.Date
}

object CustomerLastContact {
  @scala.inline
  def apply(account: java.lang.String, lastContactDate: stdLib.Date): CustomerLastContact = {
    val __obj = js.Dynamic.literal(account = account, lastContactDate = lastContactDate)
  
    __obj.asInstanceOf[CustomerLastContact]
  }
}

