package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.Hex
import typings.wixStyleReact.anon.Placeholder
import typings.wixStyleReact.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerColorPickerConverterHexMod {
  
  @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerConverterHex", JSImport.Default)
  @js.native
  open class default protected () extends ColorPickerConverterHex {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerConverterHex", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerConverterHex", "default.propTypes")
    @js.native
    def propTypes: Placeholder = js.native
    inline def propTypes_=(x: Placeholder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ColorPickerConverterHex extends PureComponent[Any, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MColorPickerConverterHex(props: Any): Unit = js.native
    
    def change(param0: Target): Unit = js.native
    
    def handleKeyDown(event: Any): Unit = js.native
    
    def handleOnBlur(): Unit = js.native
    
    def handleOnFocus(): Unit = js.native
    
    @JSName("state")
    var state_ColorPickerConverterHex: Hex = js.native
  }
}
