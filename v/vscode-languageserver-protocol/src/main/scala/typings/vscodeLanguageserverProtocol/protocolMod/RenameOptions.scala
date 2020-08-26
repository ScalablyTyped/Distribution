package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameOptions extends WorkDoneProgressOptions {
  /**
    * Renames should be checked and tested before being executed.
    *
    * @since version 3.12.0
    */
  var prepareProvider: js.UndefOr[Boolean] = js.native
}

object RenameOptions {
  @scala.inline
  def apply(): RenameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameOptions]
  }
  @scala.inline
  implicit class RenameOptionsOps[Self <: RenameOptions] (val x: Self) extends AnyVal {
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
    def setPrepareProvider(value: Boolean): Self = this.set("prepareProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepareProvider: Self = this.set("prepareProvider", js.undefined)
  }
  
}

