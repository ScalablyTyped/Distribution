package typings.stripe.stripeMod.fileUploads

import typings.stripe.Anon_Applicationoctetstream
import typings.stripe.stripeMod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUploadCreationOptions extends IDataOptions {
  var file: Anon_Applicationoctetstream
  var purpose: IPurpose
}

object IFileUploadCreationOptions {
  @scala.inline
  def apply(
    file: Anon_Applicationoctetstream,
    purpose: IPurpose,
    expand: js.Array[String] = null,
    include: js.Array[String] = null
  ): IFileUploadCreationOptions = {
    val __obj = js.Dynamic.literal(file = file, purpose = purpose)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[IFileUploadCreationOptions]
  }
}

