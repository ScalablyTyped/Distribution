package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemableDecorationInstanceRenderOptions extends js.Object {
  /**
    * Defines the rendering options of the attachment that is inserted after the decorated text.
    */
  var after: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.native
  /**
    * Defines the rendering options of the attachment that is inserted before the decorated text.
    */
  var before: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.native
}

object ThemableDecorationInstanceRenderOptions {
  @scala.inline
  def apply(): ThemableDecorationInstanceRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemableDecorationInstanceRenderOptions]
  }
  @scala.inline
  implicit class ThemableDecorationInstanceRenderOptionsOps[Self <: ThemableDecorationInstanceRenderOptions] (val x: Self) extends AnyVal {
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
    def setAfter(value: ThemableDecorationAttachmentRenderOptions): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setBefore(value: ThemableDecorationAttachmentRenderOptions): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
  }
  
}

