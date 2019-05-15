package typings
package yaddaLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  var annotations: Annotations
  var description: js.Array[java.lang.String]
  var scenarios: js.Array[Scenario]
  var title: java.lang.String
}

object Feature {
  @scala.inline
  def apply(
    annotations: Annotations,
    description: js.Array[java.lang.String],
    scenarios: js.Array[Scenario],
    title: java.lang.String
  ): Feature = {
    val __obj = js.Dynamic.literal(annotations = annotations, description = description, scenarios = scenarios, title = title)
  
    __obj.asInstanceOf[Feature]
  }
}

