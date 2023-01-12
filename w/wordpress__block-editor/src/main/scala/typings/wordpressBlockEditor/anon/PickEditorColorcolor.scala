package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@wordpress/block-editor.@wordpress/block-editor.EditorColor, 'color'> */
trait PickEditorColorcolor extends StObject {
  
  var color: String
}
object PickEditorColorcolor {
  
  inline def apply(color: String): PickEditorColorcolor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickEditorColorcolor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickEditorColorcolor] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
