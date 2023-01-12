package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifacts extends StObject {
  
  var artifacts: scala.Double
  
  var environments: scala.Double
  
  var lastRelease: scala.Double
  
  var none: scala.Double
  
  var tags: scala.Double
  
  var triggers: scala.Double
  
  var variables: scala.Double
}
object Artifacts {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Artifacts] (val x: Self) extends AnyVal {
    
    inline def setArtifacts(value: scala.Double): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setEnvironments(value: scala.Double): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setLastRelease(value: scala.Double): Self = StObject.set(x, "lastRelease", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setTags(value: scala.Double): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTriggers(value: scala.Double): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: scala.Double): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
