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
  def apply(meta_description: Nullable[String] = null, meta_title: Nullable[String] = null): Metadata = {
    val __obj = js.Dynamic.literal()
    if (meta_description != null) __obj.updateDynamic("meta_description")(meta_description.asInstanceOf[js.Any])
    if (meta_title != null) __obj.updateDynamic("meta_title")(meta_title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

