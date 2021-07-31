package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.ReturnType
import typings.wixStyleReact.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorPickerMod {
  
  @JSImport("wix-style-react/dist/es/src/ColorPicker", JSImport.Default)
  @js.native
  class default ()
    extends Component[ColorPickerProps, js.Object, js.Any]
  
  type ColorInstance = ReturnType[FnCall]
  
  type ColorPicker = Component[ColorPickerProps, js.Object, js.Any]
  
  @js.native
  trait ColorPickerProps extends StObject {
    
    var addTooltipContent: js.UndefOr[ReactNode] = js.native
    
    var allowEmpty: js.UndefOr[Boolean] = js.native
    
    var dataHook: js.UndefOr[String] = js.native
    
    var emptyPlaceholder: js.UndefOr[String] = js.native
    
    var onAdd: js.UndefOr[js.Function1[/* color */ String | ColorInstance, Unit]] = js.native
    
    def onCancel(color: String): Unit = js.native
    def onCancel(color: ColorInstance): Unit = js.native
    
    def onChange(color: String): Unit = js.native
    def onChange(color: ColorInstance): Unit = js.native
    
    def onConfirm(color: String): Unit = js.native
    def onConfirm(color: ColorInstance): Unit = js.native
    
    var showConverter: js.UndefOr[Boolean] = js.native
    
    var showHistory: js.UndefOr[Boolean] = js.native
    
    var showInput: js.UndefOr[Boolean] = js.native
    
    var value: String | ColorInstance = js.native
  }
}
