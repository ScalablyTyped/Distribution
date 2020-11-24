package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Artifacts extends js.Object {
  
  var artifacts: scala.Double = js.native
  
  var environments: scala.Double = js.native
  
  var lastRelease: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var tags: scala.Double = js.native
  
  var triggers: scala.Double = js.native
  
  var variables: scala.Double = js.native
}
object Artifacts {
  
  @scala.inline
  def apply(
    artifacts: scala.Double,
    environments: scala.Double,
    lastRelease: scala.Double,
    none: scala.Double,
    tags: scala.Double,
    triggers: scala.Double,
    variables: scala.Double
  ): Artifacts = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], lastRelease = lastRelease.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifacts]
  }
  
  @scala.inline
  implicit class ArtifactsOps[Self <: Artifacts] (val x: Self) extends AnyVal {
    
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
    def setArtifacts(value: scala.Double): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironments(value: scala.Double): Self = this.set("environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRelease(value: scala.Double): Self = this.set("lastRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: scala.Double): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggers(value: scala.Double): Self = this.set("triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: scala.Double): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
