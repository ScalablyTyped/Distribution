package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.reusable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks", "getBlockSupport")
@js.native
object getBlockSupport_reusable extends js.Object {
  
  def apply(nameOrType: String, feature: reusable): js.UndefOr[js.Any] = js.native
  def apply(nameOrType: Block[_], feature: reusable): js.UndefOr[js.Any] = js.native
  def apply[T](nameOrType: String, feature: reusable, defaultSupports: T): T | Boolean | Double | String = js.native
  def apply[T](nameOrType: Block[_], feature: reusable, defaultSupports: T): T | Boolean | Double | String = js.native
}
