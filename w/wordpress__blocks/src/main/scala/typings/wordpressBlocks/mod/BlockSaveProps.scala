package typings.wordpressBlocks.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockSaveProps[T /* <: Record[String, _] */] extends js.Object {
  val attributes: T
}

object BlockSaveProps {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](attributes: T): BlockSaveProps[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockSaveProps[T]]
  }
}

