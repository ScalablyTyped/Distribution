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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withColorContextMod {
  
  object default {
    
    // prettier-ignore
    @JSImport("@wordpress/block-editor/components/color-palette/with-color-context", JSImport.Default)
    @js.native
    def apply[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: ComponentClass[ProvidedProps with OwnProps, ComponentState]): ComponentType[
        (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
      ] = js.native
    @JSImport("@wordpress/block-editor/components/color-palette/with-color-context", JSImport.Default)
    @js.native
    def apply[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: FunctionComponent[ProvidedProps with OwnProps]): ComponentType[
        (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
      ] = js.native
  }
  
  object withColorContext {
    
    @js.native
    trait Props extends StObject {
      
      var colors: js.Array[EditorColor] = js.native
      
      var disableCustomColors: Boolean = js.native
      
      var hasColorsToChoose: Boolean = js.native
    }
    object Props {
      
      @scala.inline
      def apply(colors: js.Array[EditorColor], disableCustomColors: Boolean, hasColorsToChoose: Boolean): Props = {
        val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], disableCustomColors = disableCustomColors.asInstanceOf[js.Any], hasColorsToChoose = hasColorsToChoose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColors(value: js.Array[EditorColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorsVarargs(value: EditorColor*): Self = StObject.set(x, "colors", js.Array(value :_*))
        
        @scala.inline
        def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHasColorsToChoose(value: Boolean): Self = StObject.set(x, "hasColorsToChoose", value.asInstanceOf[js.Any])
      }
    }
  }
}
