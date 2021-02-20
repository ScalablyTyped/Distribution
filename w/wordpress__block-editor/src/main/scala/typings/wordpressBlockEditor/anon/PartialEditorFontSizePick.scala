package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/block-editor.@wordpress/block-editor.EditorFontSize> & std.Pick<@wordpress/block-editor.@wordpress/block-editor.EditorFontSize, 'size'> */
@js.native
trait PartialEditorFontSizePick extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] with Double = js.native
  
  var slug: js.UndefOr[String] = js.native
}
object PartialEditorFontSizePick {
  
  @scala.inline
  def apply(size: js.UndefOr[Double] with Double): PartialEditorFontSizePick = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialEditorFontSizePick]
  }
  
  @scala.inline
  implicit class PartialEditorFontSizePickMutableBuilder[Self <: PartialEditorFontSizePick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: js.UndefOr[Double] with Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
  }
}
