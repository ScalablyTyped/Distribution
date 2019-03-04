package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlDomImplementation extends js.Object {
  def hasFeature(feature: java.lang.String, version: js.Any): scala.Boolean
}

object IXmlDomImplementation {
  @scala.inline
  def apply(hasFeature: js.Function2[java.lang.String, js.Any, scala.Boolean]): IXmlDomImplementation = {
    val __obj = js.Dynamic.literal(hasFeature = hasFeature)
  
    __obj.asInstanceOf[IXmlDomImplementation]
  }
}

