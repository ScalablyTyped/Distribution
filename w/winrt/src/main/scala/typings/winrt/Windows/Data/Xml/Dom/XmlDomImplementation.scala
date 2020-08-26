package typings.winrt.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDomImplementation extends IXmlDomImplementation

object XmlDomImplementation {
  @scala.inline
  def apply(hasFeature: (String, js.Any) => Boolean): XmlDomImplementation = {
    val __obj = js.Dynamic.literal(hasFeature = js.Any.fromFunction2(hasFeature))
    __obj.asInstanceOf[XmlDomImplementation]
  }
}

