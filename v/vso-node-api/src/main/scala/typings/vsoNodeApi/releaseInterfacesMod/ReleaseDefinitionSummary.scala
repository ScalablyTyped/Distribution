package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionSummary extends StObject {
  
  var environments: js.Array[ReleaseDefinitionEnvironmentSummary]
  
  var releaseDefinition: ReleaseDefinitionShallowReference
  
  var releases: js.Array[Release]
}
object ReleaseDefinitionSummary {
  
  @scala.inline
  def apply(
    environments: js.Array[ReleaseDefinitionEnvironmentSummary],
    releaseDefinition: ReleaseDefinitionShallowReference,
    releases: js.Array[Release]
  ): ReleaseDefinitionSummary = {
    val __obj = js.Dynamic.literal(environments = environments.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releases = releases.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionSummary]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionSummaryMutableBuilder[Self <: ReleaseDefinitionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironments(value: js.Array[ReleaseDefinitionEnvironmentSummary]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentsVarargs(value: ReleaseDefinitionEnvironmentSummary*): Self = StObject.set(x, "environments", js.Array(value :_*))
    
    @scala.inline
    def setReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = StObject.set(x, "releaseDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleases(value: js.Array[Release]): Self = StObject.set(x, "releases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleasesVarargs(value: Release*): Self = StObject.set(x, "releases", js.Array(value :_*))
  }
}
