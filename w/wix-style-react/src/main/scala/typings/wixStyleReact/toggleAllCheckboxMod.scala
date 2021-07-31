package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleAllCheckboxMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/SelectorList/ToggleAllCheckbox", JSImport.Default)
  @js.native
  val default: FC[ToggleAllCheckboxProps] = js.native
  
  trait ToggleAllCheckboxProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    def deselectAll(): Unit
    
    var deselectAllText: js.UndefOr[String] = js.undefined
    
    var enabledItemsAmount: Double
    
    def selectAll(): Unit
    
    var selectAllText: js.UndefOr[String] = js.undefined
    
    var selectedEnabledItemsAmount: Double
  }
  object ToggleAllCheckboxProps {
    
    @scala.inline
    def apply(
      deselectAll: () => Unit,
      enabledItemsAmount: Double,
      selectAll: () => Unit,
      selectedEnabledItemsAmount: Double
    ): ToggleAllCheckboxProps = {
      val __obj = js.Dynamic.literal(deselectAll = js.Any.fromFunction0(deselectAll), enabledItemsAmount = enabledItemsAmount.asInstanceOf[js.Any], selectAll = js.Any.fromFunction0(selectAll), selectedEnabledItemsAmount = selectedEnabledItemsAmount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleAllCheckboxProps]
    }
    
    @scala.inline
    implicit class ToggleAllCheckboxPropsMutableBuilder[Self <: ToggleAllCheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDeselectAll(value: () => Unit): Self = StObject.set(x, "deselectAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeselectAllText(value: String): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeselectAllTextUndefined: Self = StObject.set(x, "deselectAllText", js.undefined)
      
      @scala.inline
      def setEnabledItemsAmount(value: Double): Self = StObject.set(x, "enabledItemsAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAll(value: () => Unit): Self = StObject.set(x, "selectAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
      
      @scala.inline
      def setSelectedEnabledItemsAmount(value: Double): Self = StObject.set(x, "selectedEnabledItemsAmount", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[ToggleAllCheckboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `toggleAllCheckboxMod.foo` */
  override def _to: FC[ToggleAllCheckboxProps] = default
}
