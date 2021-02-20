package typings.winrt.Windows.Data.Xml.Dom

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlDocumentStatics extends StObject {
  
  def loadFromFileAsync(file: IStorageFile): IAsyncOperation[XmlDocument] = js.native
  def loadFromFileAsync(file: IStorageFile, loadSettings: XmlLoadSettings): IAsyncOperation[XmlDocument] = js.native
  
  def loadFromUriAsync(uri: Uri): IAsyncOperation[XmlDocument] = js.native
  def loadFromUriAsync(uri: Uri, loadSettings: XmlLoadSettings): IAsyncOperation[XmlDocument] = js.native
}
