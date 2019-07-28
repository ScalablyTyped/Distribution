package typings.winrt.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlDomImplementation extends js.Object {
  def hasFeature(feature: String, version: js.Any): Boolean
}

object IXmlDomImplementation {
  @scala.inline
  def apply(hasFeature: (String, js.Any) => Boolean): IXmlDomImplementation = {
    val __obj = js.Dynamic.literal(hasFeature = js.Any.fromFunction2(hasFeature))
  
    __obj.asInstanceOf[IXmlDomImplementation]
  }
}

