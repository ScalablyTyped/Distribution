package typings.winrtDashUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AllJoynTrafficType extends js.Object

/** Defines values used to indicate the type of data carried in session traffic. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynTrafficType")
@js.native
object AllJoynTrafficType extends js.Object {
  /** Message traffic. */
  @js.native
  sealed trait messages extends AllJoynTrafficType
  
  /** Session carries a reliable byte stream. */
  @js.native
  sealed trait rawReliable extends AllJoynTrafficType
  
  /** Unreliable (lossy) byte stream. */
  @js.native
  sealed trait rawUnreliable extends AllJoynTrafficType
  
  /** Traffic type currently unknown. */
  @js.native
  sealed trait unknown extends AllJoynTrafficType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AllJoynTrafficType with Double] = js.native
  /* 1 */ @js.native
  object messages extends TopLevel[messages with Double]
  
  /* 3 */ @js.native
  object rawReliable extends TopLevel[rawReliable with Double]
  
  /* 2 */ @js.native
  object rawUnreliable extends TopLevel[rawUnreliable with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

