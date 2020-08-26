package typings.xmlcreate.xmlDtdElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlDtdElementOptions extends js.Object {
  /**
    * The text of the declaration.
    */
  var charData: String = js.native
}

object IXmlDtdElementOptions {
  @scala.inline
  def apply(charData: String): IXmlDtdElementOptions = {
    val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlDtdElementOptions]
  }
  @scala.inline
  implicit class IXmlDtdElementOptionsOps[Self <: IXmlDtdElementOptions] (val x: Self) extends AnyVal {
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
    def setCharData(value: String): Self = this.set("charData", value.asInstanceOf[js.Any])
  }
  
}

