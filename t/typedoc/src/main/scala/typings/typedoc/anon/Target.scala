package typings.typedoc.anon

import typings.typedoc.distLibSerializationSchemaMod.CommentDisplayPart
import typings.typedoc.typedocStrings.`inline-tag`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target
  extends StObject
     with CommentDisplayPart {
  
  var kind: `inline-tag`
  
  var tag: /* template literal string: @${string} */ String
  
  var target: js.UndefOr[String | Double] = js.undefined
  
  var text: String
}
object Target {
  
  inline def apply(tag: /* template literal string: @${string} */ String, text: String): Target = {
    val __obj = js.Dynamic.literal(kind = "inline-tag", tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    inline def setKind(value: `inline-tag`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTag(value: /* template literal string: @${string} */ String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String | Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
