package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlNodeSerializer extends js.Object {
  var innerText: java.lang.String
  def getXml(): java.lang.String
}

object IXmlNodeSerializer {
  @scala.inline
  def apply(getXml: js.Function0[java.lang.String], innerText: java.lang.String): IXmlNodeSerializer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getXml")(getXml)
    __obj.updateDynamic("innerText")(innerText)
    __obj.asInstanceOf[IXmlNodeSerializer]
  }
}

