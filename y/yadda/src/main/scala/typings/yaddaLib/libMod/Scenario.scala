package typings
package yaddaLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scenario extends js.Object {
  var annotations: Annotations
  var description: js.Array[java.lang.String]
  var steps: js.Array[Step]
  var title: java.lang.String
}

object Scenario {
  @scala.inline
  def apply(
    annotations: Annotations,
    description: js.Array[java.lang.String],
    steps: js.Array[Step],
    title: java.lang.String
  ): Scenario = {
    val __obj = js.Dynamic.literal(annotations = annotations, description = description, steps = steps, title = title)
  
    __obj.asInstanceOf[Scenario]
  }
}

