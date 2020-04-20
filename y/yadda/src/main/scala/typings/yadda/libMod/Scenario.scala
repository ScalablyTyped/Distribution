package typings.yadda.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scenario extends js.Object {
  var annotations: Annotations
  var description: js.Array[String]
  var steps: js.Array[Step]
  var title: String
}

object Scenario {
  @scala.inline
  def apply(annotations: Annotations, description: js.Array[String], steps: js.Array[Step], title: String): Scenario = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scenario]
  }
}

