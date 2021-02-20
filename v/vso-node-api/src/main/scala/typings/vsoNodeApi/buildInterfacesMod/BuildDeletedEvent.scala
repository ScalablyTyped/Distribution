package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDeletedEvent extends RealtimeBuildEvent {
  
  var build: Build = js.native
}
object BuildDeletedEvent {
  
  @scala.inline
  def apply(build: Build, buildId: Double): BuildDeletedEvent = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDeletedEvent]
  }
  
  @scala.inline
  implicit class BuildDeletedEventMutableBuilder[Self <: BuildDeletedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Build): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
  }
}
