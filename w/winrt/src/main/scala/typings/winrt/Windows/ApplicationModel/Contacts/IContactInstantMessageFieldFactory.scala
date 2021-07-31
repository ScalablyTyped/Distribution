package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContactInstantMessageFieldFactory extends StObject {
  
  def createInstantMessage(userName: String): ContactInstantMessageField = js.native
  def createInstantMessage(userName: String, category: ContactFieldCategory): ContactInstantMessageField = js.native
  def createInstantMessage(userName: String, category: ContactFieldCategory, service: String, displayText: String, verb: Uri): ContactInstantMessageField = js.native
}
