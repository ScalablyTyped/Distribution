package typings.winrt.WindowsNs.DataNs.XmlNs.XslNs

import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.IXmlNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXsltProcessor extends js.Object {
  def transformToString(inputNode: IXmlNode): String
}

object IXsltProcessor {
  @scala.inline
  def apply(transformToString: IXmlNode => String): IXsltProcessor = {
    val __obj = js.Dynamic.literal(transformToString = js.Any.fromFunction1(transformToString))
  
    __obj.asInstanceOf[IXsltProcessor]
  }
}

