package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.inserter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "hasBlockSupport")
@js.native
object hasBlockSupport_inserter extends js.Object {
  def apply(nameOrType: String, feature: inserter): Boolean = js.native
  def apply(nameOrType: String, feature: inserter, defaultSupports: Boolean): Boolean = js.native
  def apply(nameOrType: Block[_], feature: inserter): Boolean = js.native
  def apply(nameOrType: Block[_], feature: inserter, defaultSupports: Boolean): Boolean = js.native
}

