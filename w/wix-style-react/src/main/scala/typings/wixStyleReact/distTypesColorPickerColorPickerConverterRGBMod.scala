package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.OnAdd
import typings.wixStyleReact.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerColorPickerConverterRGBMod {
  
  @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerConverterRGB", JSImport.Default)
  @js.native
  open class default protected () extends ColorPickerConverterRGB {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerConverterRGB", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerConverterRGB", "default.propTypes")
    @js.native
    def propTypes: OnAdd = js.native
    inline def propTypes_=(x: OnAdd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ColorPickerConverterRGB extends PureComponent[Any, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MColorPickerConverterRGB(props: Any): Unit = js.native
    
    def change(part: Any, param1: Target): Unit = js.native
    
    def isInputsEmpty(): Boolean = js.native
  }
}
