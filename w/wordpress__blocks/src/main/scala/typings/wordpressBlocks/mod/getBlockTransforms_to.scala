package typings.wordpressBlocks.mod

import typings.std.Record
import typings.wordpressBlocks.anon.BlockName
import typings.wordpressBlocks.wordpressBlocksStrings.to
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks", "getBlockTransforms")
@js.native
object getBlockTransforms_to extends js.Object {
  
  def apply[T /* <: Record[String, _] */](direction: to): js.Array[Transform[T] with BlockName] = js.native
  def apply[T /* <: Record[String, _] */](direction: to, blockTypeOrName: String): js.Array[Transform[T] with BlockName] = js.native
  def apply[T /* <: Record[String, _] */](direction: to, blockTypeOrName: Block[js.Object]): js.Array[Transform[T] with BlockName] = js.native
}
