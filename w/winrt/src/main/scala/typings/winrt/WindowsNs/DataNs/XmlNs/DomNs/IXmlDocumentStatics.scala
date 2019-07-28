package typings.winrt.WindowsNs.DataNs.XmlNs.DomNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlDocumentStatics extends js.Object {
  def loadFromFileAsync(file: IStorageFile): IAsyncOperation[XmlDocument] = js.native
  def loadFromFileAsync(file: IStorageFile, loadSettings: XmlLoadSettings): IAsyncOperation[XmlDocument] = js.native
  def loadFromUriAsync(uri: Uri): IAsyncOperation[XmlDocument] = js.native
  def loadFromUriAsync(uri: Uri, loadSettings: XmlLoadSettings): IAsyncOperation[XmlDocument] = js.native
}

