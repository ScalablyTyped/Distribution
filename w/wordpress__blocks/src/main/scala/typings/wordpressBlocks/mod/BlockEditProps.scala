package typings.wordpressBlocks.mod

import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockEditProps[T /* <: Record[String, _] */] extends BlockSaveProps[T] {
  val className: String = js.native
  val isSelected: Boolean = js.native
  def setAttributes(attrs: Partial[T]): Unit = js.native
}

object BlockEditProps {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](attributes: T, className: String, isSelected: Boolean, setAttributes: Partial[T] => Unit): BlockEditProps[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], setAttributes = js.Any.fromFunction1(setAttributes))
    __obj.asInstanceOf[BlockEditProps[T]]
  }
  @scala.inline
  implicit class BlockEditPropsOps[Self <: BlockEditProps[_], /* <: typings.std.Record[java.lang.String, _] */ T] (val x: Self with BlockEditProps[T]) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetAttributes(value: Partial[T] => Unit): Self = this.set("setAttributes", js.Any.fromFunction1(value))
  }
  
}

