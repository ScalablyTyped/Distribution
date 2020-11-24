package typings.wordpressBlocks.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks", "registerBlockType")
@js.native
object registerBlockType extends js.Object {
  
  def apply[T /* <: Record[String, _] */](name: String, settings: BlockConfiguration[T]): js.UndefOr[Block[T]] = js.native
}
