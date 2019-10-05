package typings.winrt.Windows.Data.Xml.Xsl

import typings.winrt.Windows.Data.Xml.Dom.IXmlNode
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
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

