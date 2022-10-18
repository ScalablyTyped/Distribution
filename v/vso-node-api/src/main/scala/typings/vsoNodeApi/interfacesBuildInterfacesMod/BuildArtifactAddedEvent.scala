package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildArtifactAddedEvent
  extends StObject
     with BuildUpdatedEvent {
  
  var artifact: BuildArtifact
}
object BuildArtifactAddedEvent {
  
  inline def apply(artifact: BuildArtifact, build: Build, buildId: Double): BuildArtifactAddedEvent = {
    val __obj = js.Dynamic.literal(artifact = artifact.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildArtifactAddedEvent]
  }
  
  extension [Self <: BuildArtifactAddedEvent](x: Self) {
    
    inline def setArtifact(value: BuildArtifact): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
  }
}
