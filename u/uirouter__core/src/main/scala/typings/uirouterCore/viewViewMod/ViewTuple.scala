package typings.uirouterCore.viewViewMod

import typings.uirouterCore.viewInterfaceMod.ActiveUIView
import typings.uirouterCore.viewInterfaceMod.ViewConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewTuple extends js.Object {
  var uiView: ActiveUIView = js.native
  var viewConfig: ViewConfig = js.native
}

object ViewTuple {
  @scala.inline
  def apply(uiView: ActiveUIView, viewConfig: ViewConfig): ViewTuple = {
    val __obj = js.Dynamic.literal(uiView = uiView.asInstanceOf[js.Any], viewConfig = viewConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewTuple]
  }
  @scala.inline
  implicit class ViewTupleOps[Self <: ViewTuple] (val x: Self) extends AnyVal {
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
    def setUiView(value: ActiveUIView): Self = this.set("uiView", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewConfig(value: ViewConfig): Self = this.set("viewConfig", value.asInstanceOf[js.Any])
  }
  
}

