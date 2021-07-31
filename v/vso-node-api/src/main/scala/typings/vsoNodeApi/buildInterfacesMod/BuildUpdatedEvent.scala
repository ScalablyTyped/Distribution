package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildUpdatedEvent
  extends StObject
     with RealtimeBuildEvent {
  
  var build: Build
}
object BuildUpdatedEvent {
  
  @scala.inline
  def apply(build: Build, buildId: Double): BuildUpdatedEvent = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildUpdatedEvent]
  }
  
  @scala.inline
  implicit class BuildUpdatedEventMutableBuilder[Self <: BuildUpdatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Build): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
  }
}
