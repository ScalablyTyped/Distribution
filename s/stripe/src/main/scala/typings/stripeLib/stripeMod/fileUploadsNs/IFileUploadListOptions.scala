package typings
package stripeLib.stripeMod.fileUploadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUploadListOptions
  extends stripeLib.stripeMod.IListOptionsCreated {
  /**
    * The file purpose to filter queries by. If none is provided, files will not be
    * filtered by purpose.
    */
  var purpose: IPurpose
}

object IFileUploadListOptions {
  @scala.inline
  def apply(
    purpose: IPurpose,
    created: java.lang.String | stripeLib.stripeMod.IDateFilter = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null
  ): IFileUploadListOptions = {
    val __obj = js.Dynamic.literal(purpose = purpose)
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[IFileUploadListOptions]
  }
}

