package typings.wixStyleReact

import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.OnCancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerColorPickerActionsMod {
  
  object default {
    
    inline def apply(param0: OnCancel): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerActions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerActions", "default.propTypes.onCancel")
      @js.native
      val onCancel: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerActions", "default.propTypes.onConfirm")
      @js.native
      val onConfirm: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
    }
  }
}
