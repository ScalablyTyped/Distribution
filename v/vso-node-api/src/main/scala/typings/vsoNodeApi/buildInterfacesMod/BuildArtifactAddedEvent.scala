package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildArtifactAddedEvent
  extends StObject
     with BuildUpdatedEvent {
  
  var artifact: BuildArtifact
}
object BuildArtifactAddedEvent {
  
  @scala.inline
  def apply(artifact: BuildArtifact, build: Build, buildId: Double): BuildArtifactAddedEvent = {
    val __obj = js.Dynamic.literal(artifact = artifact.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildArtifactAddedEvent]
  }
  
  @scala.inline
  implicit class BuildArtifactAddedEventMutableBuilder[Self <: BuildArtifactAddedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifact(value: BuildArtifact): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
  }
}
