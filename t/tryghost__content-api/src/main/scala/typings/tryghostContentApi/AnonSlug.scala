package typings.tryghostContentApi

import typings.tryghostContentApi.mod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSlug extends js.Object {
  var slug: Nullable[String]
}

object AnonSlug {
  @scala.inline
  def apply(slug: Nullable[String] = null): AnonSlug = {
    val __obj = js.Dynamic.literal()
    if (slug != null) __obj.updateDynamic("slug")(slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSlug]
  }
}

