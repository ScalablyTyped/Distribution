package typings.wordpressBlocks.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockSaveProps[T /* <: Record[String, _] */] extends js.Object {
  val attributes: T = js.native
}

object BlockSaveProps {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](attributes: T): BlockSaveProps[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockSaveProps[T]]
  }
  @scala.inline
  implicit class BlockSavePropsOps[Self <: BlockSaveProps[_], /* <: typings.std.Record[java.lang.String, _] */ T] (val x: Self with BlockSaveProps[T]) extends AnyVal {
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
    def setAttributes(value: T): Self = this.set("attributes", value.asInstanceOf[js.Any])
  }
  
}

