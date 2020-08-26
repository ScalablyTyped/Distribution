package typings.winrt.Windows.Data.Xml.Xsl

import typings.winrt.Windows.Data.Xml.Dom.IXmlNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXsltProcessor extends js.Object {
  def transformToString(inputNode: IXmlNode): String = js.native
}

object IXsltProcessor {
  @scala.inline
  def apply(transformToString: IXmlNode => String): IXsltProcessor = {
    val __obj = js.Dynamic.literal(transformToString = js.Any.fromFunction1(transformToString))
    __obj.asInstanceOf[IXsltProcessor]
  }
  @scala.inline
  implicit class IXsltProcessorOps[Self <: IXsltProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTransformToString(value: IXmlNode => String): Self = this.set("transformToString", js.Any.fromFunction1(value))
  }
  
}

