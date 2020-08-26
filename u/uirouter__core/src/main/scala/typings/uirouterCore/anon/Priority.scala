package typings.uirouterCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Priority extends js.Object {
  var priority: Double = js.native
}

object Priority {
  @scala.inline
  def apply(priority: Double): Priority = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Priority]
  }
  @scala.inline
  implicit class PriorityOps[Self <: Priority] (val x: Self) extends AnyVal {
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
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
  }
  
}

