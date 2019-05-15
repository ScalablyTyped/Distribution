package typings
package yaddaLib.libParsersFeatureParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioExport extends js.Object {
  var annotations: AnnotationsExport
  var description: java.lang.String
  var steps: js.Array[java.lang.String]
  var title: java.lang.String
}

object ScenarioExport {
  @scala.inline
  def apply(
    annotations: AnnotationsExport,
    description: java.lang.String,
    steps: js.Array[java.lang.String],
    title: java.lang.String
  ): ScenarioExport = {
    val __obj = js.Dynamic.literal(annotations = annotations, description = description, steps = steps, title = title)
  
    __obj.asInstanceOf[ScenarioExport]
  }
}

