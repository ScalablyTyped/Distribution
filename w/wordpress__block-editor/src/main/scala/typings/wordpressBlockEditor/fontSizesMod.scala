package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typings.wordpressBlockEditor.mod.EditorFontSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontSizesMod {
  
  object FontSizePicker extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/font-sizes", "FontSizePicker")
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    /* Inlined std.Omit<@wordpress/components.@wordpress/components.FontSizePicker.Props, 'disableCustomFontSizes' | 'fontSizes'> */
    @js.native
    trait Props extends StObject {
      
      var fallbackFontSize: js.UndefOr[Double] = js.native
      
      var onChange: js.Function0[Unit] = js.native
      
      var value: js.UndefOr[Double] = js.native
      
      var withSlider: js.UndefOr[Boolean] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(onChange: () => Unit): Props = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction0(onChange))
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFallbackFontSize(value: Double): Self = StObject.set(x, "fallbackFontSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFallbackFontSizeUndefined: Self = StObject.set(x, "fallbackFontSize", js.undefined)
        
        @scala.inline
        def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
        
        @scala.inline
        def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        
        @scala.inline
        def setWithSlider(value: Boolean): Self = StObject.set(x, "withSlider", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWithSliderUndefined: Self = StObject.set(x, "withSlider", js.undefined)
      }
    }
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `FontSizePicker.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  @JSImport("@wordpress/block-editor/components/font-sizes", "getFontSize")
  @js.native
  def getFontSize(
    fontSizes: js.Array[EditorFontSize],
    fontSizeAttribute: js.UndefOr[scala.Nothing],
    customFontSizeAttribute: Double
  ): PartialEditorFontSizePick = js.native
  @JSImport("@wordpress/block-editor/components/font-sizes", "getFontSize")
  @js.native
  def getFontSize(fontSizes: js.Array[EditorFontSize], fontSizeAttribute: String, customFontSizeAttribute: Double): PartialEditorFontSizePick = js.native
  
  @JSImport("@wordpress/block-editor/components/font-sizes", "getFontSizeClass")
  @js.native
  def getFontSizeClass(fontSizeSlug: String): String = js.native
  
  @JSImport("@wordpress/block-editor/components/font-sizes", "withFontSizes")
  @js.native
  def withFontSizes(attributeNames: String*): js.Function1[/* component */ ComponentType[_], ComponentType[_]] = js.native
}
