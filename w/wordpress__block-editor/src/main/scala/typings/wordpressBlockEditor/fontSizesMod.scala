package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typings.wordpressBlockEditor.mod.EditorFontSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontSizesMod {
  
  @JSImport("@wordpress/block-editor/components/font-sizes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object FontSizePicker extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/font-sizes", "FontSizePicker")
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    /* Inlined std.Omit<@wordpress/components.@wordpress/components.FontSizePicker.Props, 'disableCustomFontSizes' | 'fontSizes'> */
    trait Props extends StObject {
      
      var fallbackFontSize: js.UndefOr[Double] = js.undefined
      
      var onChange: js.Function0[Unit]
      
      var value: js.UndefOr[Double] = js.undefined
      
      var withSlider: js.UndefOr[Boolean] = js.undefined
    }
    object Props {
      
      inline def apply(onChange: () => Unit): Props = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction0(onChange))
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setFallbackFontSize(value: Double): Self = StObject.set(x, "fallbackFontSize", value.asInstanceOf[js.Any])
        
        inline def setFallbackFontSizeUndefined: Self = StObject.set(x, "fallbackFontSize", js.undefined)
        
        inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        
        inline def setWithSlider(value: Boolean): Self = StObject.set(x, "withSlider", value.asInstanceOf[js.Any])
        
        inline def setWithSliderUndefined: Self = StObject.set(x, "withSlider", js.undefined)
      }
    }
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `FontSizePicker.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  inline def getFontSize(fontSizes: js.Array[EditorFontSize], fontSizeAttribute: String, customFontSizeAttribute: Double): PartialEditorFontSizePick = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontSize")(fontSizes.asInstanceOf[js.Any], fontSizeAttribute.asInstanceOf[js.Any], customFontSizeAttribute.asInstanceOf[js.Any])).asInstanceOf[PartialEditorFontSizePick]
  inline def getFontSize(fontSizes: js.Array[EditorFontSize], fontSizeAttribute: Unit, customFontSizeAttribute: Double): PartialEditorFontSizePick = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontSize")(fontSizes.asInstanceOf[js.Any], fontSizeAttribute.asInstanceOf[js.Any], customFontSizeAttribute.asInstanceOf[js.Any])).asInstanceOf[PartialEditorFontSizePick]
  
  inline def getFontSizeClass(fontSizeSlug: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontSizeClass")(fontSizeSlug.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def withFontSizes(attributeNames: String*): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFontSizes")(attributeNames.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
}
