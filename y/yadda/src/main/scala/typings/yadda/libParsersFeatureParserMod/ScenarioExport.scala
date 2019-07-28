package typings.yadda.libParsersFeatureParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioExport extends js.Object {
  var annotations: AnnotationsExport
  var description: String
  var steps: js.Array[String]
  var title: String
}

object ScenarioExport {
  @scala.inline
  def apply(annotations: AnnotationsExport, description: String, steps: js.Array[String], title: String): ScenarioExport = {
    val __obj = js.Dynamic.literal(annotations = annotations, description = description, steps = steps, title = title)
  
    __obj.asInstanceOf[ScenarioExport]
  }
}

