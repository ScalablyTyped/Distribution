package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealtimeBuildEvent extends StObject {
  
  var buildId: Double
}
object RealtimeBuildEvent {
  
  inline def apply(buildId: Double): RealtimeBuildEvent = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeBuildEvent]
  }
  
  extension [Self <: RealtimeBuildEvent](x: Self) {
    
    inline def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
  }
}
