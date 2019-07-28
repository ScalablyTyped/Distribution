package typings.winrt.WindowsNs.DataNs.XmlNs.XslNs

import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.IXmlNode
import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Xml.Xsl.XsltProcessor")
@js.native
class XsltProcessor protected () extends IXsltProcessor {
  def this(document: XmlDocument) = this()
  /* CompleteClass */
  override def transformToString(inputNode: IXmlNode): String = js.native
}

