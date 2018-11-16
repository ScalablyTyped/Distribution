package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlDocumentStatics extends js.Object {
  def loadFromFileAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[XmlDocument] = js.native
  def loadFromFileAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile, loadSettings: XmlLoadSettings): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[XmlDocument] = js.native
  def loadFromUriAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[XmlDocument] = js.native
  def loadFromUriAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri, loadSettings: XmlLoadSettings): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[XmlDocument] = js.native
}

