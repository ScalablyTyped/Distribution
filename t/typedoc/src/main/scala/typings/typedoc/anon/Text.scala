package typings.typedoc.anon

import typings.typedoc.distLibSerializationSchemaMod.CommentDisplayPart
import typings.typedoc.typedocStrings.code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text
  extends StObject
     with CommentDisplayPart
     with typings.typedoc.distLibModelsCommentsCommentMod.CommentDisplayPart {
  
  var kind: code
  
  var text: String
}
object Text {
  
  inline def apply(text: String): Text = {
    val __obj = js.Dynamic.literal(kind = "code", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    inline def setKind(value: code): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
