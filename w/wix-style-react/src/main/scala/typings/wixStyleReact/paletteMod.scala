package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paletteMod {
  
  @JSImport("wix-style-react/dist/es/src/Palette", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[PaletteProps, js.Object, js.Any]
  
  type Palette = PureComponent[PaletteProps, js.Object, js.Any]
  
  trait PaletteProps extends StObject {
    
    var buttonText: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object PaletteProps {
    
    inline def apply(): PaletteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaletteProps]
    }
    
    extension [Self <: PaletteProps](x: Self) {
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
}
