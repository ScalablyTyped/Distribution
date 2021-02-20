package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeBuildEvent extends StObject {
  
  var buildId: Double = js.native
}
object RealtimeBuildEvent {
  
  @scala.inline
  def apply(buildId: Double): RealtimeBuildEvent = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeBuildEvent]
  }
  
  @scala.inline
  implicit class RealtimeBuildEventMutableBuilder[Self <: RealtimeBuildEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
  }
}
