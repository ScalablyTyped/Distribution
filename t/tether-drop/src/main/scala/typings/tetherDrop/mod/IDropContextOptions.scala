package typings.tetherDrop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropContextOptions extends js.Object {
  var classPrefix: js.UndefOr[String] = js.native
  var defaults: js.UndefOr[IDropOptions] = js.native
}

object IDropContextOptions {
  @scala.inline
  def apply(): IDropContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropContextOptions]
  }
  @scala.inline
  implicit class IDropContextOptionsOps[Self <: IDropContextOptions] (val x: Self) extends AnyVal {
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
    def setClassPrefix(value: String): Self = this.set("classPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassPrefix: Self = this.set("classPrefix", js.undefined)
    @scala.inline
    def setDefaults(value: IDropOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
  }
  
}

