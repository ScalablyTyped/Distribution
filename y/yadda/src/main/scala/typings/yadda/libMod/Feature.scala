package typings.yadda.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  var annotations: Annotations
  var description: js.Array[String]
  var scenarios: js.Array[Scenario]
  var title: String
}

object Feature {
  @scala.inline
  def apply(
    annotations: Annotations,
    description: js.Array[String],
    scenarios: js.Array[Scenario],
    title: String
  ): Feature = {
    val __obj = js.Dynamic.literal(annotations = annotations, description = description, scenarios = scenarios, title = title)
  
    __obj.asInstanceOf[Feature]
  }
}

