package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "getBlockSupport")
@js.native
object getBlockSupport_align extends js.Object {
  def apply(nameOrType: String, feature: align): js.UndefOr[js.Any] = js.native
  def apply(nameOrType: Block[_], feature: align): js.UndefOr[js.Any] = js.native
  def apply[T](nameOrType: String, feature: align, defaultSupports: T): T | Boolean | Double | String = js.native
  def apply[T](nameOrType: Block[_], feature: align, defaultSupports: T): T | Boolean | Double | String = js.native
}

