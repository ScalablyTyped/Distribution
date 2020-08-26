package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fret extends js.Object {
  var fret: Double = js.native
  var str: Double = js.native
}

object Fret {
  @scala.inline
  def apply(fret: Double, str: Double): Fret = {
    val __obj = js.Dynamic.literal(fret = fret.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fret]
  }
  @scala.inline
  implicit class FretOps[Self <: Fret] (val x: Self) extends AnyVal {
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
    def setFret(value: Double): Self = this.set("fret", value.asInstanceOf[js.Any])
    @scala.inline
    def setStr(value: Double): Self = this.set("str", value.asInstanceOf[js.Any])
  }
  
}

