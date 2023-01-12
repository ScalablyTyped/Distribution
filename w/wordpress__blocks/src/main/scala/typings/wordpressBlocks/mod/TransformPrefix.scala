package typings.wordpressBlocks.mod

import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformPrefix[T /* <: Record[String, Any] */]
  extends StObject
     with Transform[T] {
  
  var prefix: String
  
  var priority: js.UndefOr[Double] = js.undefined
  
  def transform(content: String): BlockInstance[Partial[T]]
  
  var `type`: prefix
}
object TransformPrefix {
  
  inline def apply[T /* <: Record[String, Any] */](prefix: String, transform: String => BlockInstance[Partial[T]]): TransformPrefix[T] = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
    __obj.updateDynamic("type")("prefix")
    __obj.asInstanceOf[TransformPrefix[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformPrefix[?], T /* <: Record[String, Any] */] (val x: Self & TransformPrefix[T]) extends AnyVal {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTransform(value: String => BlockInstance[Partial[T]]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    inline def setType(value: prefix): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
