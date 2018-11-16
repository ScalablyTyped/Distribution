package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContactInstantMessageFieldFactory extends js.Object {
  def createInstantMessage(userName: java.lang.String): ContactInstantMessageField = js.native
  def createInstantMessage(userName: java.lang.String, category: ContactFieldCategory): ContactInstantMessageField = js.native
  def createInstantMessage(
    userName: java.lang.String,
    category: ContactFieldCategory,
    service: java.lang.String,
    displayText: java.lang.String,
    verb: winrtLib.WindowsNs.FoundationNs.Uri
  ): ContactInstantMessageField = js.native
}

