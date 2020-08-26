package typings.yadda.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feature extends js.Object {
  var annotations: Annotations = js.native
  var description: js.Array[String] = js.native
  var scenarios: js.Array[Scenario] = js.native
  var title: String = js.native
}

object Feature {
  @scala.inline
  def apply(
    annotations: Annotations,
    description: js.Array[String],
    scenarios: js.Array[Scenario],
    title: String
  ): Feature = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  @scala.inline
  implicit class FeatureOps[Self <: Feature] (val x: Self) extends AnyVal {
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
    def setScenariosVarargs(value: Scenario*): Self = this.set("scenarios", js.Array(value :_*))
    @scala.inline
    def setScenarios(value: js.Array[Scenario]): Self = this.set("scenarios", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

