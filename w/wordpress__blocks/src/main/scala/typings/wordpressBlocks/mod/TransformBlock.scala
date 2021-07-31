package typings.wordpressBlocks.mod

import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.block_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformBlock[T /* <: Record[String, js.Any] */]
  extends StObject
     with Transform[T] {
  
  var blocks: js.Array[String]
  
  var isMatch: js.UndefOr[js.Function1[/* attributes */ T, Boolean]] = js.undefined
  
  var isMultiBlock: js.UndefOr[Boolean] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  def transform(attributes: T): BlockInstance[Partial[T]]
  
  var `type`: block_
}
object TransformBlock {
  
  @scala.inline
  def apply[T /* <: Record[String, js.Any] */](blocks: js.Array[String], transform: T => BlockInstance[Partial[T]]): TransformBlock[T] = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
    __obj.updateDynamic("type")("block")
    __obj.asInstanceOf[TransformBlock[T]]
  }
  
  @scala.inline
  implicit class TransformBlockMutableBuilder[Self <: TransformBlock[?], T /* <: Record[String, js.Any] */] (val x: Self & TransformBlock[T]) extends AnyVal {
    
    @scala.inline
    def setBlocks(value: js.Array[String]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksVarargs(value: String*): Self = StObject.set(x, "blocks", js.Array(value :_*))
    
    @scala.inline
    def setIsMatch(value: /* attributes */ T => Boolean): Self = StObject.set(x, "isMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsMatchUndefined: Self = StObject.set(x, "isMatch", js.undefined)
    
    @scala.inline
    def setIsMultiBlock(value: Boolean): Self = StObject.set(x, "isMultiBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultiBlockUndefined: Self = StObject.set(x, "isMultiBlock", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setTransform(value: T => BlockInstance[Partial[T]]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: block_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
