package typings.wixStyleReact.baseComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WixComponentProps extends js.Object {
  var dataHook: js.UndefOr[String] = js.native
  var styles: js.UndefOr[String] = js.native
}

object WixComponentProps {
  @scala.inline
  def apply(): WixComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WixComponentProps]
  }
  @scala.inline
  implicit class WixComponentPropsOps[Self <: WixComponentProps] (val x: Self) extends AnyVal {
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
    def setDataHook(value: String): Self = this.set("dataHook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataHook: Self = this.set("dataHook", js.undefined)
    @scala.inline
    def setStyles(value: String): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

