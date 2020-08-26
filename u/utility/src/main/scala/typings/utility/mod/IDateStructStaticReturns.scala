package typings.utility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateStructStaticReturns extends js.Object {
  var H: Double = js.native
  var YYYYMMDD: Double = js.native
}

object IDateStructStaticReturns {
  @scala.inline
  def apply(H: Double, YYYYMMDD: Double): IDateStructStaticReturns = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], YYYYMMDD = YYYYMMDD.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateStructStaticReturns]
  }
  @scala.inline
  implicit class IDateStructStaticReturnsOps[Self <: IDateStructStaticReturns] (val x: Self) extends AnyVal {
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
    def setH(value: Double): Self = this.set("H", value.asInstanceOf[js.Any])
    @scala.inline
    def setYYYYMMDD(value: Double): Self = this.set("YYYYMMDD", value.asInstanceOf[js.Any])
  }
  
}

