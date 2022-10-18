package typings.typedoc.anon

import typings.typedoc.distLibSerializationSchemaMod.CommentDisplayPart
import typings.typedoc.typedocStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind
  extends StObject
     with CommentDisplayPart
     with typings.typedoc.distLibModelsCommentsCommentMod.CommentDisplayPart {
  
  var kind: text
  
  var text: String
}
object Kind {
  
  inline def apply(text: String): Kind = {
    val __obj = js.Dynamic.literal(kind = "text", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
  
  extension [Self <: Kind](x: Self) {
    
    inline def setKind(value: text): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
