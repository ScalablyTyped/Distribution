package typings.tryghostContentApi.anon

import typings.tryghostContentApi.mod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slug extends js.Object {
  var slug: Nullable[String]
}

object Slug {
  @scala.inline
  def apply(slug: Nullable[String] = null): Slug = {
    val __obj = js.Dynamic.literal(slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slug]
  }
}

