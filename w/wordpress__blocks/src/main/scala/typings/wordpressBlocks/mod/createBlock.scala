package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "createBlock")
@js.native
object createBlock extends js.Object {
  def apply[T /* <: Record[String, _] */](name: String): BlockInstance[T] = js.native
  def apply[T /* <: Record[String, _] */](
    name: String,
    attributes: js.UndefOr[scala.Nothing],
    innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): BlockInstance[T] = js.native
  def apply[T /* <: Record[String, _] */](name: String, attributes: Partial[T]): BlockInstance[T] = js.native
  def apply[T /* <: Record[String, _] */](name: String, attributes: Partial[T], innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): BlockInstance[T] = js.native
}

