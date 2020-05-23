package typings.wordpressBlocks.mod

import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockEditProps[T /* <: Record[String, _] */] extends BlockSaveProps[T] {
  val className: String
  val isSelected: Boolean
  def setAttributes(attrs: Partial[T]): Unit
}

object BlockEditProps {
  @scala.inline
  def apply[T](attributes: T, className: String, isSelected: Boolean, setAttributes: Partial[T] => Unit): BlockEditProps[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], setAttributes = js.Any.fromFunction1(setAttributes))
    __obj.asInstanceOf[BlockEditProps[T]]
  }
}

