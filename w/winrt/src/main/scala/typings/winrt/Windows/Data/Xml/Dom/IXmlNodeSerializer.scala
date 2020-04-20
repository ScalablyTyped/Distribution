package typings.winrt.Windows.Data.Xml.Dom

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
    val __obj = js.Dynamic.literal(getXml = js.Any.fromFunction0(getXml), innerText = innerText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlNodeSerializer]
  }
}

