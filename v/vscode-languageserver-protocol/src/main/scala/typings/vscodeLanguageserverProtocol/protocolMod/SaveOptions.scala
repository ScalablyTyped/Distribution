package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveOptions extends js.Object {
  /**
    * The client is supposed to include the content on save.
    */
  var includeText: js.UndefOr[Boolean] = js.native
}

object SaveOptions {
  @scala.inline
  def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
  @scala.inline
  implicit class SaveOptionsOps[Self <: SaveOptions] (val x: Self) extends AnyVal {
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
    def setIncludeText(value: Boolean): Self = this.set("includeText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeText: Self = this.set("includeText", js.undefined)
  }
  
}

