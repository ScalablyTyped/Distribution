package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.multiple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "hasBlockSupport")
@js.native
object hasBlockSupport_multiple extends js.Object {
  def apply(nameOrType: String, feature: multiple): Boolean = js.native
  def apply(nameOrType: String, feature: multiple, defaultSupports: Boolean): Boolean = js.native
  def apply(nameOrType: Block[_], feature: multiple): Boolean = js.native
  def apply(nameOrType: Block[_], feature: multiple, defaultSupports: Boolean): Boolean = js.native
}

