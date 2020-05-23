package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.customClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "hasBlockSupport")
@js.native
object hasBlockSupport_customClassName extends js.Object {
  def apply(nameOrType: String, feature: customClassName): Boolean = js.native
  def apply(nameOrType: String, feature: customClassName, defaultSupports: Boolean): Boolean = js.native
  def apply(nameOrType: Block[_], feature: customClassName): Boolean = js.native
  def apply(nameOrType: Block[_], feature: customClassName, defaultSupports: Boolean): Boolean = js.native
}

