package typings.wordpressBlocks

import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformBlock[T /* <: Record[String, Any] */]
  extends StObject
     with Transform[T] {
  
  var blocks: js.Array[String]
  
  var isMatch: js.UndefOr[js.Function2[/* attributes */ T, /* block */ String | js.Array[String], Boolean]] = js.undefined
  
  var isMultiBlock: js.UndefOr[Boolean] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  def transform(attributes: T): BlockInstance[Partial[T]]
  
  var `type`: block
}
object TransformBlock {
  
  inline def apply[T /* <: Record[String, Any] */](blocks: js.Array[String], transform: T => BlockInstance[Partial[T]]): TransformBlock[T] = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
    __obj.updateDynamic("type")("block")
    __obj.asInstanceOf[TransformBlock[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformBlock[?], T /* <: Record[String, Any] */] (val x: Self & TransformBlock[T]) extends AnyVal {
    
    inline def setBlocks(value: js.Array[String]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksVarargs(value: String*): Self = StObject.set(x, "blocks", js.Array(value*))
    
    inline def setIsMatch(value: (/* attributes */ T, /* block */ String | js.Array[String]) => Boolean): Self = StObject.set(x, "isMatch", js.Any.fromFunction2(value))
    
    inline def setIsMatchUndefined: Self = StObject.set(x, "isMatch", js.undefined)
    
    inline def setIsMultiBlock(value: Boolean): Self = StObject.set(x, "isMultiBlock", value.asInstanceOf[js.Any])
    
    inline def setIsMultiBlockUndefined: Self = StObject.set(x, "isMultiBlock", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTransform(value: T => BlockInstance[Partial[T]]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    inline def setType(value: block): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
