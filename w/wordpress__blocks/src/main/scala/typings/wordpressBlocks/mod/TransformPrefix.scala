package typings.wordpressBlocks.mod

import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformPrefix[T /* <: Record[String, _] */] extends Transform[T] {
  
  var prefix: String = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  def transform(content: String): BlockInstance[Partial[T]] = js.native
  
  var `type`: prefix = js.native
}
object TransformPrefix {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](prefix: String, transform: String => BlockInstance[Partial[T]], `type`: prefix): TransformPrefix[T] = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformPrefix[T]]
  }
  
  @scala.inline
  implicit class TransformPrefixMutableBuilder[Self <: TransformPrefix[_], T /* <: Record[String, _] */] (val x: Self with TransformPrefix[T]) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setTransform(value: String => BlockInstance[Partial[T]]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: prefix): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
