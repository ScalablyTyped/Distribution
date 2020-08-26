package typings.uirouterAngularjs.interfaceMod

import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _Ng1StateDeclaration extends StateDeclaration {
  @JSName("onEnter")
  var onEnter__Ng1StateDeclaration: js.UndefOr[js.Any] = js.native
  @JSName("onExit")
  var onExit__Ng1StateDeclaration: js.UndefOr[js.Any] = js.native
  @JSName("onRetain")
  var onRetain__Ng1StateDeclaration: js.UndefOr[js.Any] = js.native
  @JSName("views")
  var views__Ng1StateDeclaration: js.UndefOr[js.Any] = js.native
}

object _Ng1StateDeclaration {
  @scala.inline
  def apply(): _Ng1StateDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Ng1StateDeclaration]
  }
  @scala.inline
  implicit class _Ng1StateDeclarationOps[Self <: _Ng1StateDeclaration] (val x: Self) extends AnyVal {
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
    def setOnEnter(value: js.Any): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnExit(value: js.Any): Self = this.set("onExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    @scala.inline
    def setOnRetain(value: js.Any): Self = this.set("onRetain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRetain: Self = this.set("onRetain", js.undefined)
    @scala.inline
    def setViews(value: js.Any): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
  
}

