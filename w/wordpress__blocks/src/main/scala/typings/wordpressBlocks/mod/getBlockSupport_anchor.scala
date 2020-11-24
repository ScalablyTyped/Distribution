package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.anchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks", "getBlockSupport")
@js.native
object getBlockSupport_anchor extends js.Object {
  
  def apply(nameOrType: String, feature: anchor): js.UndefOr[js.Any] = js.native
  def apply(nameOrType: Block[_], feature: anchor): js.UndefOr[js.Any] = js.native
  def apply[T](nameOrType: String, feature: anchor, defaultSupports: T): T | Boolean | Double | String = js.native
  def apply[T](nameOrType: Block[_], feature: anchor, defaultSupports: T): T | Boolean | Double | String = js.native
}
