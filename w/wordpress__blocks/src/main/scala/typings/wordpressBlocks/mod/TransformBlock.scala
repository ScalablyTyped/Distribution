package typings.wordpressBlocks.mod

import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.block_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformBlock[T /* <: Record[String, _] */] extends Transform[T] {
  
  var blocks: js.Array[String] = js.native
  
  var isMatch: js.UndefOr[js.Function1[/* attributes */ T, Boolean]] = js.native
  
  var isMultiBlock: js.UndefOr[Boolean] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  def transform(attributes: T): BlockInstance[Partial[T]] = js.native
  
  var `type`: block_ = js.native
}
object TransformBlock {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](blocks: js.Array[String], transform: T => BlockInstance[Partial[T]], `type`: block_): TransformBlock[T] = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformBlock[T]]
  }
  
  @scala.inline
  implicit class TransformBlockOps[Self <: TransformBlock[_], T /* <: Record[String, _] */] (val x: Self with TransformBlock[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlocksVarargs(value: String*): Self = this.set("blocks", js.Array(value :_*))
    
    @scala.inline
    def setBlocks(value: js.Array[String]): Self = this.set("blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: T => BlockInstance[Partial[T]]): Self = this.set("transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: block_): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMatch(value: /* attributes */ T => Boolean): Self = this.set("isMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsMatch: Self = this.set("isMatch", js.undefined)
    
    @scala.inline
    def setIsMultiBlock(value: Boolean): Self = this.set("isMultiBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMultiBlock: Self = this.set("isMultiBlock", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
}
