package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContactFieldFactory extends js.Object {
  def createField(
    name: java.lang.String,
    value: java.lang.String,
    `type`: ContactFieldType,
    category: ContactFieldCategory
  ): ContactField = js.native
  def createField(value: java.lang.String, `type`: ContactFieldType): ContactField = js.native
  def createField(value: java.lang.String, `type`: ContactFieldType, category: ContactFieldCategory): ContactField = js.native
}

