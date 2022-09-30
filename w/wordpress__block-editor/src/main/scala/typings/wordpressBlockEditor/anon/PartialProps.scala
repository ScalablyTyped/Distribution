package typings.wordpressBlockEditor.anon

import typings.wordpressBlockEditor.mod.EditorColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/block-editor.@wordpress/block-editor/components/color-palette/with-color-context.withColorContext.Props> */
trait PartialProps extends StObject {
  
  var colors: js.UndefOr[js.Array[EditorColor]] = js.undefined
  
  var disableCustomColors: js.UndefOr[Boolean] = js.undefined
  
  var hasColorsToChoose: js.UndefOr[Boolean] = js.undefined
}
object PartialProps {
  
  inline def apply(): PartialProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProps]
  }
  
  extension [Self <: PartialProps](x: Self) {
    
    inline def setColors(value: js.Array[EditorColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: EditorColor*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
    
    inline def setDisableCustomColorsUndefined: Self = StObject.set(x, "disableCustomColors", js.undefined)
    
    inline def setHasColorsToChoose(value: Boolean): Self = StObject.set(x, "hasColorsToChoose", value.asInstanceOf[js.Any])
    
    inline def setHasColorsToChooseUndefined: Self = StObject.set(x, "hasColorsToChoose", js.undefined)
  }
}
