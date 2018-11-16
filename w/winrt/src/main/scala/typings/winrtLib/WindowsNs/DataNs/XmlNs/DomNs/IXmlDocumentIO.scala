package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlDocumentIO extends js.Object {
  def loadXml(xml: java.lang.String): scala.Unit = js.native
  def loadXml(xml: java.lang.String, loadSettings: XmlLoadSettings): scala.Unit = js.native
  def saveToFileAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

