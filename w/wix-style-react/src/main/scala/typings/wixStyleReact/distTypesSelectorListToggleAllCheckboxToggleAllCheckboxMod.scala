package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.DeselectAll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorListToggleAllCheckboxToggleAllCheckboxMod {
  
  object default {
    
    inline def apply(param0: DeselectAll): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/SelectorList/ToggleAllCheckbox/ToggleAllCheckbox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/SelectorList/ToggleAllCheckbox/ToggleAllCheckbox", "default.defaultProps.dataHook_1")
      @js.native
      val dataHook1: String = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/ToggleAllCheckbox/ToggleAllCheckbox", "default.defaultProps.deselectAllText_1")
      @js.native
      val deselectAllText1: String = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/ToggleAllCheckbox/ToggleAllCheckbox", "default.defaultProps.selectAllText_1")
      @js.native
      val selectAllText1: String = js.native
    }
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SelectorList/ToggleAllCheckbox/ToggleAllCheckbox", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/ToggleAllCheckbox/ToggleAllCheckbox", "default.propTypes.deselectAll")
      @js.native
      val deselectAll: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/ToggleAllCheckbox/ToggleAllCheckbox", "default.propTypes.deselectAllText")
      @js.native
      val deselectAllText: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/ToggleAllCheckbox/ToggleAllCheckbox", "default.propTypes.enabledItemsAmount")
      @js.native
      val enabledItemsAmount: Validator[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/ToggleAllCheckbox/ToggleAllCheckbox", "default.propTypes.selectAll")
      @js.native
      val selectAll: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/ToggleAllCheckbox/ToggleAllCheckbox", "default.propTypes.selectAllText")
      @js.native
      val selectAllText: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/ToggleAllCheckbox/ToggleAllCheckbox", "default.propTypes.selectedEnabledItemsAmount")
      @js.native
      val selectedEnabledItemsAmount: Validator[Double] = js.native
    }
  }
}
