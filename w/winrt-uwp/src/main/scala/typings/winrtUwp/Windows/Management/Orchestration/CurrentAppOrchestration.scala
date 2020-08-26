package typings.winrtUwp.Windows.Management.Orchestration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentAppOrchestration extends js.Object {
   /* unmapped type */ var startSingleAppMode: js.Any = js.native
}

object CurrentAppOrchestration {
  @scala.inline
  def apply(startSingleAppMode: js.Any): CurrentAppOrchestration = {
    val __obj = js.Dynamic.literal(startSingleAppMode = startSingleAppMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentAppOrchestration]
  }
  @scala.inline
  implicit class CurrentAppOrchestrationOps[Self <: CurrentAppOrchestration] (val x: Self) extends AnyVal {
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
    def setStartSingleAppMode(value: js.Any): Self = this.set("startSingleAppMode", value.asInstanceOf[js.Any])
  }
  
}

