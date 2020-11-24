package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.anchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks", "hasBlockSupport")
@js.native
object hasBlockSupport_anchor extends js.Object {
  
  def apply(nameOrType: String, feature: anchor): Boolean = js.native
  def apply(nameOrType: String, feature: anchor, defaultSupports: Boolean): Boolean = js.native
  def apply(nameOrType: Block[_], feature: anchor): Boolean = js.native
  def apply(nameOrType: Block[_], feature: anchor, defaultSupports: Boolean): Boolean = js.native
}
