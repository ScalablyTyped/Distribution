package typings
package winrtLib.WindowsNs.DataNs.XmlNs.XslNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXsltProcessor extends js.Object {
  def transformToString(inputNode: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.IXmlNode): java.lang.String
}

object IXsltProcessor {
  @scala.inline
  def apply(transformToString: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.IXmlNode => java.lang.String): IXsltProcessor = {
    val __obj = js.Dynamic.literal(transformToString = js.Any.fromFunction1(transformToString))
  
    __obj.asInstanceOf[IXsltProcessor]
  }
}

