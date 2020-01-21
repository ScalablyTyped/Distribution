package typings.yadda.featureParserMod

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
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeatureExport]
  }
}

