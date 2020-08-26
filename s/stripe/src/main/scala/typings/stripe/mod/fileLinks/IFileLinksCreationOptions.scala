package typings.stripe.mod.fileLinks

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileLinksCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A future timestamp after which the link will no longer be usable.
    */
  var expires_at: js.UndefOr[Double] = js.native
  /**
    * The ID of the file
    */
  var file: String = js.native
}

object IFileLinksCreationOptions {
  @scala.inline
  def apply(file: String): IFileLinksCreationOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileLinksCreationOptions]
  }
  @scala.inline
  implicit class IFileLinksCreationOptionsOps[Self <: IFileLinksCreationOptions] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires_at(value: Double): Self = this.set("expires_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires_at: Self = this.set("expires_at", js.undefined)
  }
  
}

