package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typedoc.anon.Kind
  - typings.typedoc.anon.Text
  - typings.typedoc.anon.Target
*/
trait CommentDisplayPart
  extends StObject
     with __ModelToObject[Any]
object CommentDisplayPart {
  
  inline def Kind(text: String): typings.typedoc.anon.Kind = {
    val __obj = js.Dynamic.literal(kind = "text", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.anon.Kind]
  }
  
  inline def Target(tag: /* template literal string: @${string} */ String, text: String): typings.typedoc.anon.Target = {
    val __obj = js.Dynamic.literal(kind = "inline-tag", tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.anon.Target]
  }
  
  inline def Text(text: String): typings.typedoc.anon.Text = {
    val __obj = js.Dynamic.literal(kind = "code", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.anon.Text]
  }
}
