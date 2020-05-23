package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.className
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "getBlockSupport")
@js.native
object getBlockSupport_className extends js.Object {
  def apply(nameOrType: String, feature: className): js.UndefOr[js.Any] = js.native
  def apply(nameOrType: Block[_], feature: className): js.UndefOr[js.Any] = js.native
  def apply[T](nameOrType: String, feature: className, defaultSupports: T): T | Boolean | Double | String = js.native
  def apply[T](nameOrType: Block[_], feature: className, defaultSupports: T): T | Boolean | Double | String = js.native
}

