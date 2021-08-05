package typings.wordpressBlockEditor

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.std.Omit
import typings.wordpressBlockEditor.anon.PartialProps
import typings.wordpressBlockEditor.mod.EditorColor
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.colors
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.disableCustomColors
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.hasColorsToChoose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withColorContextMod {
  
  object default {
    
    // prettier-ignore
    inline def apply[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: ComponentClass[ProvidedProps & OwnProps, ComponentState]): ComponentType[
        (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
      ] = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
        (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
      ]]
    inline def apply[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: FunctionComponent[ProvidedProps & OwnProps]): ComponentType[
        (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
      ] = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
        (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
      ]]
    
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
      
      extension [Self <: Props](x: Self) {
        
        inline def setColors(value: js.Array[EditorColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        inline def setColorsVarargs(value: EditorColor*): Self = StObject.set(x, "colors", js.Array(value :_*))
        
        inline def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
        
        inline def setHasColorsToChoose(value: Boolean): Self = StObject.set(x, "hasColorsToChoose", value.asInstanceOf[js.Any])
      }
    }
  }
}
