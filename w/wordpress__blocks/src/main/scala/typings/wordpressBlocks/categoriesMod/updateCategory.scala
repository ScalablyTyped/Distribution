package typings.wordpressBlocks.categoriesMod

import typings.wordpressBlocks.anon.PartialCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks/api/categories", "updateCategory")
@js.native
object updateCategory extends js.Object {
  def apply(slug: String, category: PartialCategory): Unit = js.native
}

