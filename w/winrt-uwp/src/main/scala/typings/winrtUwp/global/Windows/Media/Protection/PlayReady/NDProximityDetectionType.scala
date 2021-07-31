package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the transport protocol that the proximity detection process uses. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDProximityDetectionType")
@js.native
object NDProximityDetectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Media.Protection.PlayReady.NDProximityDetectionType & Double
  ] = js.native
  
  /* 1 */ val tcp: typings.winrtUwp.Windows.Media.Protection.PlayReady.NDProximityDetectionType.tcp & Double = js.native
  
  /* 2 */ val transportAgnostic: typings.winrtUwp.Windows.Media.Protection.PlayReady.NDProximityDetectionType.transportAgnostic & Double = js.native
  
  /* 0 */ val udp: typings.winrtUwp.Windows.Media.Protection.PlayReady.NDProximityDetectionType.udp & Double = js.native
}
