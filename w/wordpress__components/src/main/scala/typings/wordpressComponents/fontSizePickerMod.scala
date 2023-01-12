package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.fontSizePickerMod.FontSizePicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontSizePickerMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/font-size-picker", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object FontSizePicker {
    
    trait FontSize extends StObject {
      
      /**
        * Label for the font size (e.g. "Small")
        */
      var name: String
      
      /**
        * Font size in px.
        */
      var size: Double
      
      /**
        * A unique identifier for the font size. Used for the class generation
        * process.
        */
      var slug: String
    }
    object FontSize {
      
      inline def apply(name: String, size: Double, slug: String): FontSize = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
        __obj.asInstanceOf[FontSize]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FontSize] (val x: Self) extends AnyVal {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Props extends StObject {
      
      /**
        * If `true`, it will not be possible to choose a custom fontSize. The
        * user will be forced to pick one of the pre-defined sizes passed in
        * fontSizes.
        */
      var disableCustomFontSizes: js.UndefOr[Boolean] = js.native
      
      /**
        * If no value exists, this prop defines the starting position for the
        * font size picker slider. Only relevant if `withSlider` is `true`.
        */
      var fallbackFontSize: js.UndefOr[Double] = js.native
      
      /**
        * An array of font size objects.
        */
      var fontSizes: js.UndefOr[js.Array[FontSize]] = js.native
      
      /**
        * A function that receives the new font size value. If `size` is
        * undefined, it should reset the value, attending to what reset means
        * in that context, e.g., set the font size to undefined or set the font
        * size to a starting value.
        */
      def onChange(): Unit = js.native
      def onChange(size: Double): Unit = js.native
      
      /**
        * The current font size value.
        */
      var value: js.UndefOr[Double] = js.native
      
      /**
        * If `true`, the UI will contain a slider, instead of a numeric text
        * input field.
        */
      var withSlider: js.UndefOr[Boolean] = js.native
    }
  }
}
