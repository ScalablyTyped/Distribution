package typings.atTryghostContentDashApi.atTryghostContentDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Excerpt extends js.Object {
  var custom_excerpt: js.UndefOr[String] = js.undefined
  var excerpt: js.UndefOr[String] = js.undefined
}

object Excerpt {
  @scala.inline
  def apply(custom_excerpt: String = null, excerpt: String = null): Excerpt = {
    val __obj = js.Dynamic.literal()
    if (custom_excerpt != null) __obj.updateDynamic("custom_excerpt")(custom_excerpt.asInstanceOf[js.Any])
    if (excerpt != null) __obj.updateDynamic("excerpt")(excerpt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Excerpt]
  }
}

