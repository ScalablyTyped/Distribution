package typings.twilsock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TelemetryPoint extends StObject
@JSImport("twilsock", "TelemetryPoint")
@js.native
object TelemetryPoint extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TelemetryPoint & Double] = js.native
  
  @js.native
  sealed trait End
    extends StObject
       with TelemetryPoint
  /* 1 */ val End: typings.twilsock.mod.TelemetryPoint.End & Double = js.native
  
  @js.native
  sealed trait Start
    extends StObject
       with TelemetryPoint
  /* 0 */ val Start: typings.twilsock.mod.TelemetryPoint.Start & Double = js.native
}
