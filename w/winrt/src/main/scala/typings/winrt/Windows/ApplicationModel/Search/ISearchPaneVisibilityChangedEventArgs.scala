package typings.winrt.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchPaneVisibilityChangedEventArgs extends js.Object {
  var visible: Boolean = js.native
}

object ISearchPaneVisibilityChangedEventArgs {
  @scala.inline
  def apply(visible: Boolean): ISearchPaneVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneVisibilityChangedEventArgs]
  }
  @scala.inline
  implicit class ISearchPaneVisibilityChangedEventArgsOps[Self <: ISearchPaneVisibilityChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

