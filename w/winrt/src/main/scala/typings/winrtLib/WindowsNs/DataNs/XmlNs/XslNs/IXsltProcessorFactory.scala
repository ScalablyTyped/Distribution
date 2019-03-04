package typings
package winrtLib.WindowsNs.DataNs.XmlNs.XslNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXsltProcessorFactory extends js.Object {
  def createInstance(document: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument): XsltProcessor
}

object IXsltProcessorFactory {
  @scala.inline
  def apply(createInstance: js.Function1[winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, XsltProcessor]): IXsltProcessorFactory = {
    val __obj = js.Dynamic.literal(createInstance = createInstance)
  
    __obj.asInstanceOf[IXsltProcessorFactory]
  }
}

