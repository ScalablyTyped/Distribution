package typings.twilsock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TelemetryPoint extends StObject
@JSImport("twilsock", "TelemetryPoint")
@js.native
object TelemetryPoint extends StObject {
  
  @js.native
  sealed trait End
    extends StObject
       with TelemetryPoint
  
  @js.native
  sealed trait Start
    extends StObject
       with TelemetryPoint
}
