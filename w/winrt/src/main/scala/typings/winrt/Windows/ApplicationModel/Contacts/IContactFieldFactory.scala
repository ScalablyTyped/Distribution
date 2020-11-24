package typings.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContactFieldFactory extends js.Object {
  
  def createField(name: String, value: String, `type`: ContactFieldType, category: ContactFieldCategory): ContactField = js.native
  def createField(value: String, `type`: ContactFieldType): ContactField = js.native
  def createField(value: String, `type`: ContactFieldType, category: ContactFieldCategory): ContactField = js.native
}
