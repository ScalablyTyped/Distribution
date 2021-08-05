package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildDestroyedEvent
  extends StObject
     with RealtimeBuildEvent {
  
  var build: Build
}
object BuildDestroyedEvent {
  
  inline def apply(build: Build, buildId: Double): BuildDestroyedEvent = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDestroyedEvent]
  }
  
  extension [Self <: BuildDestroyedEvent](x: Self) {
    
    inline def setBuild(value: Build): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
  }
}
