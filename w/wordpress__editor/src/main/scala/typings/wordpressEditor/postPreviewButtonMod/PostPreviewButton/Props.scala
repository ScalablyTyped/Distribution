package typings.wordpressEditor.postPreviewButtonMod.PostPreviewButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var children: js.UndefOr[scala.Nothing] = js.native
  var forceIsAutosaveable: js.UndefOr[Boolean] = js.native
  var forcePreviewLink: js.UndefOr[String] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setForceIsAutosaveable(value: Boolean): Self = this.set("forceIsAutosaveable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceIsAutosaveable: Self = this.set("forceIsAutosaveable", js.undefined)
    @scala.inline
    def setForcePreviewLink(value: String): Self = this.set("forcePreviewLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForcePreviewLink: Self = this.set("forcePreviewLink", js.undefined)
  }
  
}

