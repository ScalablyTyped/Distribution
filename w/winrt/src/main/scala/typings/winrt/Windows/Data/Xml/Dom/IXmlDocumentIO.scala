package typings.winrt.Windows.Data.Xml.Dom

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlDocumentIO extends js.Object {
  
  def loadXml(xml: String): Unit = js.native
  def loadXml(xml: String, loadSettings: XmlLoadSettings): Unit = js.native
  
  def saveToFileAsync(file: IStorageFile): IAsyncAction = js.native
}
