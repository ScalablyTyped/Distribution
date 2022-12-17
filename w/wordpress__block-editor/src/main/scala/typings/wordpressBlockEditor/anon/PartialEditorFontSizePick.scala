package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/block-editor.@wordpress/block-editor.EditorFontSize> & std.Pick<@wordpress/block-editor.@wordpress/block-editor.EditorFontSize, 'size'> */
trait PartialEditorFontSizePick extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var slug: js.UndefOr[String] = js.undefined
}
object PartialEditorFontSizePick {
  
  inline def apply(): PartialEditorFontSizePick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEditorFontSizePick]
  }
  
  extension [Self <: PartialEditorFontSizePick](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
  }
}
