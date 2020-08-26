package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceControlResourceDecorations extends SourceControlResourceThemableDecorations {
  /**
    * The dark theme decorations.
    */
  val dark: js.UndefOr[SourceControlResourceThemableDecorations] = js.native
  /**
    * Whether the [source control resource state](#SourceControlResourceState) should
    * be faded in the UI.
    */
  val faded: js.UndefOr[Boolean] = js.native
  /**
    * The light theme decorations.
    */
  val light: js.UndefOr[SourceControlResourceThemableDecorations] = js.native
  /**
    * Whether the [source control resource state](#SourceControlResourceState) should
    * be striked-through in the UI.
    */
  val strikeThrough: js.UndefOr[Boolean] = js.native
  /**
    * The title for a specific
    * [source control resource state](#SourceControlResourceState).
    */
  val tooltip: js.UndefOr[String] = js.native
}

object SourceControlResourceDecorations {
  @scala.inline
  def apply(): SourceControlResourceDecorations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceControlResourceDecorations]
  }
  @scala.inline
  implicit class SourceControlResourceDecorationsOps[Self <: SourceControlResourceDecorations] (val x: Self) extends AnyVal {
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
    def setDark(value: SourceControlResourceThemableDecorations): Self = this.set("dark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDark: Self = this.set("dark", js.undefined)
    @scala.inline
    def setFaded(value: Boolean): Self = this.set("faded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaded: Self = this.set("faded", js.undefined)
    @scala.inline
    def setLight(value: SourceControlResourceThemableDecorations): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLight: Self = this.set("light", js.undefined)
    @scala.inline
    def setStrikeThrough(value: Boolean): Self = this.set("strikeThrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrikeThrough: Self = this.set("strikeThrough", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

