package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickPickItem extends js.Object {
  /**
    * Always show this item.
    */
  var alwaysShow: js.UndefOr[Boolean] = js.native
  /**
    * A human-readable string which is rendered less prominent in the same line. Supports rendering of
    * [theme icons](#ThemeIcon) via the `$(<name>)`-syntax.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A human-readable string which is rendered less prominent in a separate line. Supports rendering of
    * [theme icons](#ThemeIcon) via the `$(<name>)`-syntax.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * A human-readable string which is rendered prominent. Supports rendering of [theme icons](#ThemeIcon) via
    * the `$(<name>)`-syntax.
    */
  var label: String = js.native
  /**
    * Optional flag indicating if this item is picked initially.
    * (Only honored when the picker allows multiple selections.)
    *
    * @see [QuickPickOptions.canPickMany](#QuickPickOptions.canPickMany)
    */
  var picked: js.UndefOr[Boolean] = js.native
}

object QuickPickItem {
  @scala.inline
  def apply(label: String): QuickPickItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickPickItem]
  }
  @scala.inline
  implicit class QuickPickItemOps[Self <: QuickPickItem] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlwaysShow(value: Boolean): Self = this.set("alwaysShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysShow: Self = this.set("alwaysShow", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setPicked(value: Boolean): Self = this.set("picked", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePicked: Self = this.set("picked", js.undefined)
  }
  
}

