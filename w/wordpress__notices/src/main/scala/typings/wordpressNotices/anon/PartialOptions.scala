package typings.wordpressNotices.anon

import typings.wordpressNotices.mod.Action
import typings.wordpressNotices.wordpressNoticesStrings.default
import typings.wordpressNotices.wordpressNoticesStrings.snackbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/notices.@wordpress/notices.Options> */
@js.native
trait PartialOptions extends js.Object {
  var actions: js.UndefOr[js.Array[Action]] = js.native
  var context: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var isDismissible: js.UndefOr[Boolean] = js.native
  var speak: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[default | snackbar] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: Action*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[Action]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsDismissible(value: Boolean): Self = this.set("isDismissible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDismissible: Self = this.set("isDismissible", js.undefined)
    @scala.inline
    def setSpeak(value: Boolean): Self = this.set("speak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeak: Self = this.set("speak", js.undefined)
    @scala.inline
    def setType(value: default | snackbar): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

