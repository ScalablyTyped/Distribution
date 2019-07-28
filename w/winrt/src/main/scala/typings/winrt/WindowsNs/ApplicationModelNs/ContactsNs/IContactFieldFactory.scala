package typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContactFieldFactory extends js.Object {
  def createField(name: String, value: String, `type`: ContactFieldType, category: ContactFieldCategory): ContactField = js.native
  def createField(value: String, `type`: ContactFieldType): ContactField = js.native
  def createField(value: String, `type`: ContactFieldType, category: ContactFieldCategory): ContactField = js.native
}

