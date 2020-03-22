package typings.stripe.mod.files

import typings.stripe.AnonData
import typings.stripe.mod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileCreationOptions extends IDataOptions {
  var file: AnonData
  var purpose: IPurpose
}

object IFileCreationOptions {
  @scala.inline
  def apply(
    file: AnonData,
    purpose: IPurpose,
    expand: js.Array[String] = null,
    include: js.Array[String] = null
  ): IFileCreationOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileCreationOptions]
  }
}

