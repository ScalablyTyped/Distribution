package typings.stripe.mod.files

import typings.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileListOptions extends IListOptionsCreated {
  /**
    * The file purpose to filter queries by. If none is provided, files will not be
    * filtered by purpose.
    */
  var purpose: IPurpose = js.native
}

object IFileListOptions {
  @scala.inline
  def apply(purpose: IPurpose): IFileListOptions = {
    val __obj = js.Dynamic.literal(purpose = purpose.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileListOptions]
  }
  @scala.inline
  implicit class IFileListOptionsOps[Self <: IFileListOptions] (val x: Self) extends AnyVal {
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
    def setPurpose(value: IPurpose): Self = this.set("purpose", value.asInstanceOf[js.Any])
  }
  
}

