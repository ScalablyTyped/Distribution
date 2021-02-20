package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDestroyedEvent extends RealtimeBuildEvent {
  
  var build: Build = js.native
}
object BuildDestroyedEvent {
  
  @scala.inline
  def apply(build: Build, buildId: Double): BuildDestroyedEvent = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDestroyedEvent]
  }
  
  @scala.inline
  implicit class BuildDestroyedEventMutableBuilder[Self <: BuildDestroyedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Build): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
  }
}
