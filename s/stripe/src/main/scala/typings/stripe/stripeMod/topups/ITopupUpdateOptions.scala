package typings.stripe.stripeMod.topups

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITopupUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.undefined
}

object ITopupUpdateOptions {
  @scala.inline
  def apply(
    description: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null
  ): ITopupUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ITopupUpdateOptions]
  }
}

