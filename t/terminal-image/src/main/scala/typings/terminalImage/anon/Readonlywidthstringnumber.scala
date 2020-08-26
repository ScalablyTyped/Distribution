package typings.terminalImage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  width :string | number | undefined,   height :string | number | undefined,   preserveAspectRatio :boolean | undefined}> */
@js.native
trait Readonlywidthstringnumber extends js.Object {
  val height: js.UndefOr[String | Double] = js.native
  val preserveAspectRatio: js.UndefOr[Boolean] = js.native
  val width: js.UndefOr[String | Double] = js.native
}

object Readonlywidthstringnumber {
  @scala.inline
  def apply(): Readonlywidthstringnumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Readonlywidthstringnumber]
  }
  @scala.inline
  implicit class ReadonlywidthstringnumberOps[Self <: Readonlywidthstringnumber] (val x: Self) extends AnyVal {
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
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPreserveAspectRatio(value: Boolean): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

