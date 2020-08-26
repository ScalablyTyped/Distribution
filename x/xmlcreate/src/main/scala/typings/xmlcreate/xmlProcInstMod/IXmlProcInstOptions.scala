package typings.xmlcreate.xmlProcInstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlProcInstOptions extends js.Object {
  /**
    * The data of the processing instruction, or undefined if there is no
    * content.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The target of the processing instruction.
    */
  var target: String = js.native
}

object IXmlProcInstOptions {
  @scala.inline
  def apply(target: String): IXmlProcInstOptions = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlProcInstOptions]
  }
  @scala.inline
  implicit class IXmlProcInstOptionsOps[Self <: IXmlProcInstOptions] (val x: Self) extends AnyVal {
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
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
  }
  
}

