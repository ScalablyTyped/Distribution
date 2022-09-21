package typings.yaml.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentOffset extends StObject {
  
  var comment: String
  
  var offset: Double
}
object CommentOffset {
  
  inline def apply(comment: String, offset: Double): CommentOffset = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentOffset]
  }
  
  extension [Self <: CommentOffset](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
