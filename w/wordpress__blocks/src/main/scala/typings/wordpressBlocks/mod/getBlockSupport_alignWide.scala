package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.alignWide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks", "getBlockSupport")
@js.native
object getBlockSupport_alignWide extends js.Object {
  
  def apply(nameOrType: String, feature: alignWide): js.UndefOr[js.Any] = js.native
  def apply(nameOrType: Block[_], feature: alignWide): js.UndefOr[js.Any] = js.native
  def apply[T](nameOrType: String, feature: alignWide, defaultSupports: T): T | Boolean | Double | String = js.native
  def apply[T](nameOrType: Block[_], feature: alignWide, defaultSupports: T): T | Boolean | Double | String = js.native
}
