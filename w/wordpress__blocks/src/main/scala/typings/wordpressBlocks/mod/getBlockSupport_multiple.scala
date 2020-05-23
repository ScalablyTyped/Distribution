package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.multiple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "getBlockSupport")
@js.native
object getBlockSupport_multiple extends js.Object {
  def apply(nameOrType: String, feature: multiple): js.UndefOr[js.Any] = js.native
  def apply(nameOrType: Block[_], feature: multiple): js.UndefOr[js.Any] = js.native
  def apply[T](nameOrType: String, feature: multiple, defaultSupports: T): T | Boolean | Double | String = js.native
  def apply[T](nameOrType: Block[_], feature: multiple, defaultSupports: T): T | Boolean | Double | String = js.native
}

