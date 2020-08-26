package typings.thrift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TStruct extends js.Object {
  var fname: String = js.native
}

object TStruct {
  @scala.inline
  def apply(fname: String): TStruct = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any])
    __obj.asInstanceOf[TStruct]
  }
  @scala.inline
  implicit class TStructOps[Self <: TStruct] (val x: Self) extends AnyVal {
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
    def setFname(value: String): Self = this.set("fname", value.asInstanceOf[js.Any])
  }
  
}

