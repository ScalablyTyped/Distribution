package typings
package yaddaLib.libParsersFeatureParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureExport extends js.Object {
  var annotations: AnnotationsExport
  var description: java.lang.String
  var scenarios: js.Array[ScenarioExport]
  var title: java.lang.String
}

object FeatureExport {
  @scala.inline
  def apply(
    annotations: AnnotationsExport,
    description: java.lang.String,
    scenarios: js.Array[ScenarioExport],
    title: java.lang.String
  ): FeatureExport = {
    val __obj = js.Dynamic.literal(annotations = annotations, description = description, scenarios = scenarios, title = title)
  
    __obj.asInstanceOf[FeatureExport]
  }
}

