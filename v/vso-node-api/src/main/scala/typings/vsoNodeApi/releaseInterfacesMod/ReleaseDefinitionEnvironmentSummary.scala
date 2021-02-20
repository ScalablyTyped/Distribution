package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseDefinitionEnvironmentSummary extends StObject {
  
  var id: Double = js.native
  
  var lastReleases: js.Array[ReleaseShallowReference] = js.native
  
  var name: String = js.native
}
object ReleaseDefinitionEnvironmentSummary {
  
  @scala.inline
  def apply(id: Double, lastReleases: js.Array[ReleaseShallowReference], name: String): ReleaseDefinitionEnvironmentSummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lastReleases = lastReleases.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionEnvironmentSummary]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionEnvironmentSummaryMutableBuilder[Self <: ReleaseDefinitionEnvironmentSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastReleases(value: js.Array[ReleaseShallowReference]): Self = StObject.set(x, "lastReleases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastReleasesVarargs(value: ReleaseShallowReference*): Self = StObject.set(x, "lastReleases", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
