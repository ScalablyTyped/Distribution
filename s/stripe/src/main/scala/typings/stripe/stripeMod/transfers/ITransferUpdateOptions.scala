package typings.stripe.stripeMod.transfers

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransferUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * An arbitrary string which you can attach to a transfer object. It is
    * displayed when in the web interface alongside the transfer. This
    * can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.undefined
}

object ITransferUpdateOptions {
  @scala.inline
  def apply(
    description: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null
  ): ITransferUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ITransferUpdateOptions]
  }
}

