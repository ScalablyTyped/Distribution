package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.reusable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks", "hasBlockSupport")
@js.native
object hasBlockSupport_reusable extends js.Object {
  
  def apply(nameOrType: String, feature: reusable): Boolean = js.native
  def apply(nameOrType: String, feature: reusable, defaultSupports: Boolean): Boolean = js.native
  def apply(nameOrType: Block[_], feature: reusable): Boolean = js.native
  def apply(nameOrType: Block[_], feature: reusable, defaultSupports: Boolean): Boolean = js.native
}
