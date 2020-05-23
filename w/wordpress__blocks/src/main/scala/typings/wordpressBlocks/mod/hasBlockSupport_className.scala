package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.className
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "hasBlockSupport")
@js.native
object hasBlockSupport_className extends js.Object {
  def apply(nameOrType: String, feature: className): Boolean = js.native
  def apply(nameOrType: String, feature: className, defaultSupports: Boolean): Boolean = js.native
  def apply(nameOrType: Block[_], feature: className): Boolean = js.native
  def apply(nameOrType: Block[_], feature: className, defaultSupports: Boolean): Boolean = js.native
}

