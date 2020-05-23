package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "hasBlockSupport")
@js.native
object hasBlockSupport_html extends js.Object {
  def apply(nameOrType: String, feature: html): Boolean = js.native
  def apply(nameOrType: String, feature: html, defaultSupports: Boolean): Boolean = js.native
  def apply(nameOrType: Block[_], feature: html): Boolean = js.native
  def apply(nameOrType: Block[_], feature: html, defaultSupports: Boolean): Boolean = js.native
}

