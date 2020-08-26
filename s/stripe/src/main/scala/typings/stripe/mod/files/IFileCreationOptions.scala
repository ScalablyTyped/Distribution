package typings.stripe.mod.files

import typings.stripe.anon.Data
import typings.stripe.mod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileCreationOptions extends IDataOptions {
  var file: Data = js.native
  var purpose: IPurpose = js.native
}

object IFileCreationOptions {
  @scala.inline
  def apply(file: Data, purpose: IPurpose): IFileCreationOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileCreationOptions]
  }
  @scala.inline
  implicit class IFileCreationOptionsOps[Self <: IFileCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFile(value: Data): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setPurpose(value: IPurpose): Self = this.set("purpose", value.asInstanceOf[js.Any])
  }
  
}

