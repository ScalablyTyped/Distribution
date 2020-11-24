package typings.yadda.featureParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureExport extends js.Object {
  
  var annotations: AnnotationsExport = js.native
  
  var description: String = js.native
  
  var scenarios: js.Array[ScenarioExport] = js.native
  
  var title: String = js.native
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
  
  @scala.inline
  implicit class FeatureExportOps[Self <: FeatureExport] (val x: Self) extends AnyVal {
    
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
    def setAnnotations(value: AnnotationsExport): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenariosVarargs(value: ScenarioExport*): Self = this.set("scenarios", js.Array(value :_*))
    
    @scala.inline
    def setScenarios(value: js.Array[ScenarioExport]): Self = this.set("scenarios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
