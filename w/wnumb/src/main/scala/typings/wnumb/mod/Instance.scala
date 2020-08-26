package typings.wnumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * get number from formatted string
    */
  def from(`val`: String): Double = js.native
  /**
    * format to string
    */
  def to(`val`: Double): String = js.native
}

object Instance {
  @scala.inline
  def apply(from: String => Double, to: Double => String): Instance = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), to = js.Any.fromFunction1(to))
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
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
    def setFrom(value: String => Double): Self = this.set("from", js.Any.fromFunction1(value))
    @scala.inline
    def setTo(value: Double => String): Self = this.set("to", js.Any.fromFunction1(value))
  }
  
}

