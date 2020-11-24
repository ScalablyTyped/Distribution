package typings.uifabricFoundation.libIslotsMod

import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISlotOptions[TProps] extends js.Object {
  
  var component: js.UndefOr[ElementType[TProps]] = js.native
  
  var render: js.UndefOr[ISlotRender[TProps]] = js.native
}
object ISlotOptions {
  
  @scala.inline
  def apply[TProps](): ISlotOptions[TProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlotOptions[TProps]]
  }
  
  @scala.inline
  implicit class ISlotOptionsOps[Self <: ISlotOptions[_], TProps] (val x: Self with ISlotOptions[TProps]) extends AnyVal {
    
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
    def setComponent(value: ElementType[TProps]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setRender(
      value: (/* props */ PropsWithChildren[TProps], /* defaultComponent */ ComponentType[TProps]) => ReturnType[FunctionComponent[TProps]]
    ): Self = this.set("render", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
}
