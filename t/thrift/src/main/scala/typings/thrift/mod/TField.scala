package typings.thrift.mod

import typings.thrift.mod.Thrift.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TField extends js.Object {
  var fid: Double = js.native
  var fname: String = js.native
  var ftype: Type = js.native
}

object TField {
  @scala.inline
  def apply(fid: Double, fname: String, ftype: Type): TField = {
    val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], fname = fname.asInstanceOf[js.Any], ftype = ftype.asInstanceOf[js.Any])
    __obj.asInstanceOf[TField]
  }
  @scala.inline
  implicit class TFieldOps[Self <: TField] (val x: Self) extends AnyVal {
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
    def setFid(value: Double): Self = this.set("fid", value.asInstanceOf[js.Any])
    @scala.inline
    def setFname(value: String): Self = this.set("fname", value.asInstanceOf[js.Any])
    @scala.inline
    def setFtype(value: Type): Self = this.set("ftype", value.asInstanceOf[js.Any])
  }
  
}

