package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContactInstantMessageFieldFactory extends js.Object {
  def createInstantMessage(userName: String): ContactInstantMessageField = js.native
  def createInstantMessage(userName: String, category: ContactFieldCategory): ContactInstantMessageField = js.native
  def createInstantMessage(userName: String, category: ContactFieldCategory, service: String, displayText: String, verb: Uri): ContactInstantMessageField = js.native
}

