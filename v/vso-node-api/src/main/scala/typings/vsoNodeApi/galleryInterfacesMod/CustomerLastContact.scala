package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerLastContact extends js.Object {
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
  @scala.inline
  def apply(account: String, lastContactDate: Date): CustomerLastContact = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], lastContactDate = lastContactDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomerLastContact]
  }
}

