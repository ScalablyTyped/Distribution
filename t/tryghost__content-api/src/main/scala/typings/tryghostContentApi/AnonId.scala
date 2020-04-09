package typings.tryghostContentApi

import typings.tryghostContentApi.mod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: Nullable[String]
}

object AnonId {
  @scala.inline
  def apply(id: Nullable[String] = null): AnonId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

