package typings.wordpressBlocks.parserMod

import typings.std.Record
import typings.wordpressBlocks.mod.Block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks/api/parser", "getBlockAttributes")
@js.native
object getBlockAttributes extends js.Object {
  def apply(blockTypeOrName: String, innerHTML: String): Record[String, _] = js.native
  def apply(blockTypeOrName: String, innerHTML: String, attributes: Record[String, _]): Record[String, _] = js.native
  def apply[T /* <: Block[_] */](blockTypeOrName: T, innerHTML: String): js.Any = js.native
  def apply[T /* <: Block[_] */](blockTypeOrName: T, innerHTML: String, attributes: Record[String, _]): js.Any = js.native
}

