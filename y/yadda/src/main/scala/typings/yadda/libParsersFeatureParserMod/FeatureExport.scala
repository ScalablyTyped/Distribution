package typings.yadda.libParsersFeatureParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureExport extends js.Object {
  var annotations: AnnotationsExport
  var description: String
  var scenarios: js.Array[ScenarioExport]
  var title: String
}

object FeatureExport {
  @scala.inline
  def apply(
    annotations: AnnotationsExport,
    description: String,
    scenarios: js.Array[ScenarioExport],
    title: String
  ): FeatureExport = {
    val __obj = js.Dynamic.literal(annotations = annotations, description = description, scenarios = scenarios, title = title)
  
    __obj.asInstanceOf[FeatureExport]
  }
}

