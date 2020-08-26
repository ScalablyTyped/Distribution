package typings.winjs.WinJS.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Properties
//#region Interfaces
@js.native
trait ILogOptions extends js.Object {
  var action: js.UndefOr[js.Function3[/* message */ String, /* tags */ String, /* type */ String, Unit]] = js.native
  var excludeTags: js.UndefOr[String] = js.native
  var tags: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object ILogOptions {
  @scala.inline
  def apply(): ILogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILogOptions]
  }
  @scala.inline
  implicit class ILogOptionsOps[Self <: ILogOptions] (val x: Self) extends AnyVal {
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
    def setAction(value: (/* message */ String, /* tags */ String, /* type */ String) => Unit): Self = this.set("action", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setExcludeTags(value: String): Self = this.set("excludeTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeTags: Self = this.set("excludeTags", js.undefined)
    @scala.inline
    def setTags(value: String): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

