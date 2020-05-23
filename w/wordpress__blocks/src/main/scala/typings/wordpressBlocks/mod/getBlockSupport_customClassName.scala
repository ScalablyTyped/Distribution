package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.customClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "getBlockSupport")
@js.native
object getBlockSupport_customClassName extends js.Object {
  def apply(nameOrType: String, feature: customClassName): js.UndefOr[js.Any] = js.native
  def apply(nameOrType: Block[_], feature: customClassName): js.UndefOr[js.Any] = js.native
  def apply[T](nameOrType: String, feature: customClassName, defaultSupports: T): T | Boolean | Double | String = js.native
  def apply[T](nameOrType: Block[_], feature: customClassName, defaultSupports: T): T | Boolean | Double | String = js.native
}

