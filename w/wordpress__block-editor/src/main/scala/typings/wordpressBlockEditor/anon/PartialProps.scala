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
  
  @scala.inline
  def apply(): PartialProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProps]
  }
  
  @scala.inline
  implicit class PartialPropsMutableBuilder[Self <: PartialProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[EditorColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: EditorColor*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCustomColorsUndefined: Self = StObject.set(x, "disableCustomColors", js.undefined)
    
    @scala.inline
    def setHasColorsToChoose(value: Boolean): Self = StObject.set(x, "hasColorsToChoose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasColorsToChooseUndefined: Self = StObject.set(x, "hasColorsToChoose", js.undefined)
  }
}
