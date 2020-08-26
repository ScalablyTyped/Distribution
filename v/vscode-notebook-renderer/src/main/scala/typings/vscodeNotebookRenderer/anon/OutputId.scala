package typings.vscodeNotebookRenderer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputId extends js.Object {
  var outputId: String = js.native
}

object OutputId {
  @scala.inline
  def apply(outputId: String): OutputId = {
    val __obj = js.Dynamic.literal(outputId = outputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputId]
  }
  @scala.inline
  implicit class OutputIdOps[Self <: OutputId] (val x: Self) extends AnyVal {
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
    def setOutputId(value: String): Self = this.set("outputId", value.asInstanceOf[js.Any])
  }
  
}

