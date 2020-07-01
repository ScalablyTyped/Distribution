package typings.wordpressBlocks.anon

import typings.std.Record
import typings.wordpressBlocks.mod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From[T /* <: Record[String, _] */] extends js.Object {
  /**
    * Transforms from another block type to this block type.
    */
  val from: js.UndefOr[js.Array[Transform[T]]] = js.undefined
  /**
    * Transforms from this block type to another block type.
    */
  val to: js.UndefOr[js.Array[Transform[Record[String, _]]]] = js.undefined
}

object From {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](from: js.Array[Transform[T]] = null, to: js.Array[Transform[Record[String, _]]] = null): From[T] = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From[T]]
  }
}

