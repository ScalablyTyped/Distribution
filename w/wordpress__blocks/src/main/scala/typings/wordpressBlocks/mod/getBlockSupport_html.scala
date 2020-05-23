package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "getBlockSupport")
@js.native
object getBlockSupport_html extends js.Object {
  def apply(nameOrType: String, feature: html): js.UndefOr[js.Any] = js.native
  def apply(nameOrType: Block[_], feature: html): js.UndefOr[js.Any] = js.native
  def apply[T](nameOrType: String, feature: html, defaultSupports: T): T | Boolean | Double | String = js.native
  def apply[T](nameOrType: Block[_], feature: html, defaultSupports: T): T | Boolean | Double | String = js.native
}

