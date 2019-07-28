package typings.winrt.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlNodeSerializer extends js.Object {
  var innerText: String
  def getXml(): String
}

object IXmlNodeSerializer {
  @scala.inline
  def apply(getXml: () => String, innerText: String): IXmlNodeSerializer = {
    val __obj = js.Dynamic.literal(getXml = js.Any.fromFunction0(getXml), innerText = innerText)
  
    __obj.asInstanceOf[IXmlNodeSerializer]
  }
}

