package typings.typedoc.componentMod

import typings.typedoc.applicationMod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentHost extends js.Object {
  val application: Application = js.native
}

object ComponentHost {
  @scala.inline
  def apply(application: Application): ComponentHost = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentHost]
  }
  @scala.inline
  implicit class ComponentHostOps[Self <: ComponentHost] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("application", value.asInstanceOf[js.Any])
  }
  
}

