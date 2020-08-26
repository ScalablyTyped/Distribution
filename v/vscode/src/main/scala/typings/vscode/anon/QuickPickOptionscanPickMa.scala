package typings.vscode.anon

import typings.vscode.mod.QuickPickItem
import typings.vscode.vscodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vscode.vscode.QuickPickOptions & {  canPickMany :true} */
@js.native
trait QuickPickOptionscanPickMa extends js.Object {
  /**
    * An optional flag to make the picker accept multiple selections, if true the result is an array of picks.
    */
  var canPickMany: js.UndefOr[Boolean] with `true` = js.native
  /**
    * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
    */
  var ignoreFocusOut: js.UndefOr[Boolean] = js.native
  /**
    * An optional flag to include the description when filtering the picks.
    */
  var matchOnDescription: js.UndefOr[Boolean] = js.native
  /**
    * An optional flag to include the detail when filtering the picks.
    */
  var matchOnDetail: js.UndefOr[Boolean] = js.native
  /**
    * An optional function that is invoked whenever an item is selected.
    */
  var onDidSelectItem: js.UndefOr[js.Function1[/* item */ QuickPickItem | String, _]] = js.native
  /**
    * An optional string to show as placeholder in the input box to guide the user what to pick on.
    */
  var placeHolder: js.UndefOr[String] = js.native
}

object QuickPickOptionscanPickMa {
  @scala.inline
  def apply(canPickMany: js.UndefOr[Boolean] with `true`): QuickPickOptionscanPickMa = {
    val __obj = js.Dynamic.literal(canPickMany = canPickMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickPickOptionscanPickMa]
  }
  @scala.inline
  implicit class QuickPickOptionscanPickMaOps[Self <: QuickPickOptionscanPickMa] (val x: Self) extends AnyVal {
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
    def setCanPickMany(value: js.UndefOr[Boolean] with `true`): Self = this.set("canPickMany", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreFocusOut(value: Boolean): Self = this.set("ignoreFocusOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreFocusOut: Self = this.set("ignoreFocusOut", js.undefined)
    @scala.inline
    def setMatchOnDescription(value: Boolean): Self = this.set("matchOnDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchOnDescription: Self = this.set("matchOnDescription", js.undefined)
    @scala.inline
    def setMatchOnDetail(value: Boolean): Self = this.set("matchOnDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchOnDetail: Self = this.set("matchOnDetail", js.undefined)
    @scala.inline
    def setOnDidSelectItem(value: /* item */ QuickPickItem | String => _): Self = this.set("onDidSelectItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDidSelectItem: Self = this.set("onDidSelectItem", js.undefined)
    @scala.inline
    def setPlaceHolder(value: String): Self = this.set("placeHolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceHolder: Self = this.set("placeHolder", js.undefined)
  }
  
}

