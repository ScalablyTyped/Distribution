package typings.winrt.WindowsNs.DataNs.XmlNs.XslNs

import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXsltProcessorFactory extends js.Object {
  def createInstance(document: XmlDocument): XsltProcessor
}

object IXsltProcessorFactory {
  @scala.inline
  def apply(createInstance: XmlDocument => XsltProcessor): IXsltProcessorFactory = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction1(createInstance))
  
    __obj.asInstanceOf[IXsltProcessorFactory]
  }
}

