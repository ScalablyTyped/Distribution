package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@wordpress/block-editor.@wordpress/block-editor.EditorColor, 'color'> */
@js.native
trait PickEditorColorcolor extends StObject {
  
  var color: String = js.native
}
object PickEditorColorcolor {
  
  @scala.inline
  def apply(color: String): PickEditorColorcolor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickEditorColorcolor]
  }
  
  @scala.inline
  implicit class PickEditorColorcolorMutableBuilder[Self <: PickEditorColorcolor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
