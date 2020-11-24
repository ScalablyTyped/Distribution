package typings.uifabricFoundation.controlledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IControlledStateOptions[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */] extends js.Object {
  
  var defaultPropName: js.UndefOr[TDefaultProp] = js.native
  
  var defaultPropValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
  ] = js.native
}
object IControlledStateOptions {
  
  @scala.inline
  def apply[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](): IControlledStateOptions[TProps, TProp, TDefaultProp] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IControlledStateOptions[TProps, TProp, TDefaultProp]]
  }
  
  @scala.inline
  implicit class IControlledStateOptionsOps[Self <: IControlledStateOptions[_, _, _], TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */] (val x: Self with (IControlledStateOptions[TProps, TProp, TDefaultProp])) extends AnyVal {
    
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
    def setDefaultPropName(value: TDefaultProp): Self = this.set("defaultPropName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPropName: Self = this.set("defaultPropName", js.undefined)
    
    @scala.inline
    def setDefaultPropValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ): Self = this.set("defaultPropValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPropValue: Self = this.set("defaultPropValue", js.undefined)
  }
}
