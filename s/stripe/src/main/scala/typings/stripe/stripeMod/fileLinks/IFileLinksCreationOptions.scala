package typings.stripe.stripeMod.fileLinks

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileLinksCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A future timestamp after which the link will no longer be usable.
    */
  var expires_at: js.UndefOr[Double] = js.undefined
  /**
    * The ID of the file
    */
  var file: String
}

object IFileLinksCreationOptions {
  @scala.inline
  def apply(
    file: String,
    expand: js.Array[String] = null,
    expires_at: Int | Double = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null
  ): IFileLinksCreationOptions = {
    val __obj = js.Dynamic.literal(file = file)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (expires_at != null) __obj.updateDynamic("expires_at")(expires_at.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[IFileLinksCreationOptions]
  }
}

