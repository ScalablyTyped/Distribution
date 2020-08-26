package typings.uirouterAngularjs.viewDirectiveMod

import typings.uirouterAngularjs.viewsMod.Ng1ViewConfig
import typings.uirouterCore.viewInterfaceMod.ActiveUIView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIViewData extends js.Object {
  @JSName("$cfg")
  var $cfg: Ng1ViewConfig = js.native
  @JSName("$uiView")
  var $uiView: ActiveUIView = js.native
}

object UIViewData {
  @scala.inline
  def apply($cfg: Ng1ViewConfig, $uiView: ActiveUIView): UIViewData = {
    val __obj = js.Dynamic.literal($cfg = $cfg.asInstanceOf[js.Any], $uiView = $uiView.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIViewData]
  }
  @scala.inline
  implicit class UIViewDataOps[Self <: UIViewData] (val x: Self) extends AnyVal {
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
    def set$cfg(value: Ng1ViewConfig): Self = this.set("$cfg", value.asInstanceOf[js.Any])
    @scala.inline
    def set$uiView(value: ActiveUIView): Self = this.set("$uiView", value.asInstanceOf[js.Any])
  }
  
}

