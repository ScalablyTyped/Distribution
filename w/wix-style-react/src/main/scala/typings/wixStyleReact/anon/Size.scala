package typings.wixStyleReact.anon

import typings.wixStyleReact.closeButtonMod.CloseButtonSize
import typings.wixStyleReact.closeButtonMod.CloseButtonSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[CloseButtonSize] = js.undefined
  
  var skin: js.UndefOr[CloseButtonSkin] = js.undefined
}
object Size {
  
  @scala.inline
  def apply(): Size = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setSize(value: CloseButtonSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSkin(value: CloseButtonSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
  }
}
