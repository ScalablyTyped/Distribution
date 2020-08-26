package typings.yadda.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scenario extends js.Object {
  var annotations: Annotations = js.native
  var description: js.Array[String] = js.native
  var steps: js.Array[Step] = js.native
  var title: String = js.native
}

object Scenario {
  @scala.inline
  def apply(annotations: Annotations, description: js.Array[String], steps: js.Array[Step], title: String): Scenario = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scenario]
  }
  @scala.inline
  implicit class ScenarioOps[Self <: Scenario] (val x: Self) extends AnyVal {
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
    def setAnnotations(value: Annotations): Self = this.set("annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptionVarargs(value: String*): Self = this.set("description", js.Array(value :_*))
    @scala.inline
    def setDescription(value: js.Array[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepsVarargs(value: Step*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[Step]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

