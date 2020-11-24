package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManualInterventions extends js.Object {
  
  var approvals: scala.Double = js.native
  
  var artifacts: scala.Double = js.native
  
  var environments: scala.Double = js.native
  
  var manualInterventions: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var tags: scala.Double = js.native
  
  var variables: scala.Double = js.native
}
object ManualInterventions {
  
  @scala.inline
  def apply(
    approvals: scala.Double,
    artifacts: scala.Double,
    environments: scala.Double,
    manualInterventions: scala.Double,
    none: scala.Double,
    tags: scala.Double,
    variables: scala.Double
  ): ManualInterventions = {
    val __obj = js.Dynamic.literal(approvals = approvals.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], manualInterventions = manualInterventions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualInterventions]
  }
  
  @scala.inline
  implicit class ManualInterventionsOps[Self <: ManualInterventions] (val x: Self) extends AnyVal {
    
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
    def setApprovals(value: scala.Double): Self = this.set("approvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifacts(value: scala.Double): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironments(value: scala.Double): Self = this.set("environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualInterventions(value: scala.Double): Self = this.set("manualInterventions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: scala.Double): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: scala.Double): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
