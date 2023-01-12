package typings.wordpressBlockEditor

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.wordpressBlockEditor.anon.PartialProps
import typings.wordpressBlockEditor.mod.EditorColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsColorPaletteWithColorContextMod {
  
  object default {
    
    // prettier-ignore
    inline def apply[ProvidedProps /* <: PartialProps */, OwnProps /* <: Any */](component: ComponentClass[ProvidedProps & OwnProps, ComponentState]): /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<ProvidedProps & OwnProps, react.react.ComponentState> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentClass<ProvidedProps & OwnProps, react.react.ComponentState> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any]
    inline def apply[ProvidedProps /* <: PartialProps */, OwnProps /* <: Any */](component: FunctionComponent[ProvidedProps & OwnProps]): /* import warning: importer.ImportType#apply Failed type conversion: react.react.FunctionComponent<ProvidedProps & OwnProps> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: react.react.FunctionComponent<ProvidedProps & OwnProps> extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'colors' | 'disableCustomColors' | 'hasColorsToChoose'> & std.Omit<ProvidedProps, 'hasColorsToChoose'>> : never */ js.Any]
    
    @JSImport("@wordpress/block-editor/components/color-palette/with-color-context", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object withColorContext {
    
    trait Props extends StObject {
      
      var colors: js.Array[EditorColor]
      
      var disableCustomColors: Boolean
      
      var hasColorsToChoose: Boolean
    }
    object Props {
      
      inline def apply(colors: js.Array[EditorColor], disableCustomColors: Boolean, hasColorsToChoose: Boolean): Props = {
        val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], disableCustomColors = disableCustomColors.asInstanceOf[js.Any], hasColorsToChoose = hasColorsToChoose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setColors(value: js.Array[EditorColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        inline def setColorsVarargs(value: EditorColor*): Self = StObject.set(x, "colors", js.Array(value*))
        
        inline def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
        
        inline def setHasColorsToChoose(value: Boolean): Self = StObject.set(x, "hasColorsToChoose", value.asInstanceOf[js.Any])
      }
    }
  }
}
