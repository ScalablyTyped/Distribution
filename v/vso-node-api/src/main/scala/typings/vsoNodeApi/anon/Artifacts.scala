package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Artifacts extends StObject {
  
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
  implicit class ArtifactsMutableBuilder[Self <: Artifacts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifacts(value: scala.Double): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironments(value: scala.Double): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRelease(value: scala.Double): Self = StObject.set(x, "lastRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: scala.Double): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggers(value: scala.Double): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: scala.Double): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
