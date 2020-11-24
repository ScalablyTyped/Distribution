package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks", "hasBlockSupport")
@js.native
object hasBlockSupport_align extends js.Object {
  
  def apply(nameOrType: String, feature: align): Boolean = js.native
  def apply(nameOrType: String, feature: align, defaultSupports: Boolean): Boolean = js.native
  def apply(nameOrType: Block[_], feature: align): Boolean = js.native
  def apply(nameOrType: Block[_], feature: align, defaultSupports: Boolean): Boolean = js.native
}
