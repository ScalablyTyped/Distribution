package typings.ts3NodejsLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/util/Permission.Permission.PermType> */
@js.native
trait PartialPermType extends js.Object {
  var permname: js.UndefOr[String | Double] = js.native
  var permnegated: js.UndefOr[Boolean] = js.native
  var permskip: js.UndefOr[Boolean] = js.native
  var permvalue: js.UndefOr[Double] = js.native
}

object PartialPermType {
  @scala.inline
  def apply(): PartialPermType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPermType]
  }
  @scala.inline
  implicit class PartialPermTypeOps[Self <: PartialPermType] (val x: Self) extends AnyVal {
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
    def setPermname(value: String | Double): Self = this.set("permname", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermname: Self = this.set("permname", js.undefined)
    @scala.inline
    def setPermnegated(value: Boolean): Self = this.set("permnegated", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermnegated: Self = this.set("permnegated", js.undefined)
    @scala.inline
    def setPermskip(value: Boolean): Self = this.set("permskip", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermskip: Self = this.set("permskip", js.undefined)
    @scala.inline
    def setPermvalue(value: Double): Self = this.set("permvalue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermvalue: Self = this.set("permvalue", js.undefined)
  }
  
}

