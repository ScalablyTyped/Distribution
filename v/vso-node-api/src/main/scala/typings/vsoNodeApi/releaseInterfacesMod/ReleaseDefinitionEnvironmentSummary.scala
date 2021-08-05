package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionEnvironmentSummary extends StObject {
  
  var id: Double
  
  var lastReleases: js.Array[ReleaseShallowReference]
  
  var name: String
}
object ReleaseDefinitionEnvironmentSummary {
  
  inline def apply(id: Double, lastReleases: js.Array[ReleaseShallowReference], name: String): ReleaseDefinitionEnvironmentSummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lastReleases = lastReleases.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionEnvironmentSummary]
  }
  
  extension [Self <: ReleaseDefinitionEnvironmentSummary](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastReleases(value: js.Array[ReleaseShallowReference]): Self = StObject.set(x, "lastReleases", value.asInstanceOf[js.Any])
    
    inline def setLastReleasesVarargs(value: ReleaseShallowReference*): Self = StObject.set(x, "lastReleases", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
