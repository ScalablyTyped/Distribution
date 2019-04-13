package typings
package stripeLib.stripeMod.fileUploadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUploadCreationOptions
  extends stripeLib.stripeMod.IDataOptions {
  var file: stripeLib.Anon_Applicationoctetstream
  var purpose: IPurpose
}

object IFileUploadCreationOptions {
  @scala.inline
  def apply(
    file: stripeLib.Anon_Applicationoctetstream,
    purpose: IPurpose,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null
  ): IFileUploadCreationOptions = {
    val __obj = js.Dynamic.literal(file = file, purpose = purpose)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[IFileUploadCreationOptions]
  }
}

