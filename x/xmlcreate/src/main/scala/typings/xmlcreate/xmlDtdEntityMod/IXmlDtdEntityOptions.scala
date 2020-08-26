package typings.xmlcreate.xmlDtdEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlDtdEntityOptions extends js.Object {
  /**
    * The text of the declaration.
    */
  var charData: String = js.native
}

object IXmlDtdEntityOptions {
  @scala.inline
  def apply(charData: String): IXmlDtdEntityOptions = {
    val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlDtdEntityOptions]
  }
  @scala.inline
  implicit class IXmlDtdEntityOptionsOps[Self <: IXmlDtdEntityOptions] (val x: Self) extends AnyVal {
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

