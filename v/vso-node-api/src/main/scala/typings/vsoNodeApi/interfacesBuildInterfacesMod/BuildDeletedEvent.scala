package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildDeletedEvent
  extends StObject
     with RealtimeBuildEvent {
  
  var build: Build
}
object BuildDeletedEvent {
  
  inline def apply(build: Build, buildId: Double): BuildDeletedEvent = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDeletedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildDeletedEvent] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: Build): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
  }
}
