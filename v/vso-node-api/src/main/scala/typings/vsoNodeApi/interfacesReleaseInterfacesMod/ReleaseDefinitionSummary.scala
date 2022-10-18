package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionSummary extends StObject {
  
  var environments: js.Array[ReleaseDefinitionEnvironmentSummary]
  
  var releaseDefinition: ReleaseDefinitionShallowReference
  
  var releases: js.Array[Release]
}
object ReleaseDefinitionSummary {
  
  inline def apply(
    environments: js.Array[ReleaseDefinitionEnvironmentSummary],
    releaseDefinition: ReleaseDefinitionShallowReference,
    releases: js.Array[Release]
  ): ReleaseDefinitionSummary = {
    val __obj = js.Dynamic.literal(environments = environments.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releases = releases.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionSummary]
  }
  
  extension [Self <: ReleaseDefinitionSummary](x: Self) {
    
    inline def setEnvironments(value: js.Array[ReleaseDefinitionEnvironmentSummary]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsVarargs(value: ReleaseDefinitionEnvironmentSummary*): Self = StObject.set(x, "environments", js.Array(value*))
    
    inline def setReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = StObject.set(x, "releaseDefinition", value.asInstanceOf[js.Any])
    
    inline def setReleases(value: js.Array[Release]): Self = StObject.set(x, "releases", value.asInstanceOf[js.Any])
    
    inline def setReleasesVarargs(value: Release*): Self = StObject.set(x, "releases", js.Array(value*))
  }
}
