package typings.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AllJoynTrafficType extends StObject
/** Defines values used to indicate the type of data carried in session traffic. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynTrafficType")
@js.native
object AllJoynTrafficType extends StObject {
  
  /** Message traffic. */
  @js.native
  sealed trait messages
    extends StObject
       with AllJoynTrafficType
  
  /** Session carries a reliable byte stream. */
  @js.native
  sealed trait rawReliable
    extends StObject
       with AllJoynTrafficType
  
  /** Unreliable (lossy) byte stream. */
  @js.native
  sealed trait rawUnreliable
    extends StObject
       with AllJoynTrafficType
  
  /** Traffic type currently unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with AllJoynTrafficType
}
