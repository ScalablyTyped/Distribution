package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var meta_description: js.UndefOr[Nullable[String]] = js.undefined
  var meta_title: js.UndefOr[Nullable[String]] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    meta_description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    meta_title: js.UndefOr[Null | Nullable[String]] = js.undefined
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(meta_description)) __obj.updateDynamic("meta_description")(meta_description.asInstanceOf[js.Any])
    if (!js.isUndefined(meta_title)) __obj.updateDynamic("meta_title")(meta_title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

