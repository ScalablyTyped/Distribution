package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  var container: scala.Double = js.native
  var job: scala.Double = js.native
}

object Container {
  @scala.inline
  def apply(container: scala.Double, job: scala.Double): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
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
    def setContainer(value: scala.Double): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setJob(value: scala.Double): Self = this.set("job", value.asInstanceOf[js.Any])
  }
  
}

