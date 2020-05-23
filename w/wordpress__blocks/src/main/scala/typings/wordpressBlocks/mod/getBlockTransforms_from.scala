package typings.wordpressBlocks.mod

import typings.std.Record
import typings.wordpressBlocks.anon.BlockName
import typings.wordpressBlocks.wordpressBlocksStrings.from
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "getBlockTransforms")
@js.native
object getBlockTransforms_from extends js.Object {
  def apply[T /* <: Record[String, _] */](direction: from): js.Array[Transform[T] with BlockName] = js.native
  def apply[T /* <: Record[String, _] */](direction: from, blockTypeOrName: String): js.Array[Transform[T] with BlockName] = js.native
  def apply[T /* <: Record[String, _] */](direction: from, blockTypeOrName: Block[js.Object]): js.Array[Transform[T] with BlockName] = js.native
}

