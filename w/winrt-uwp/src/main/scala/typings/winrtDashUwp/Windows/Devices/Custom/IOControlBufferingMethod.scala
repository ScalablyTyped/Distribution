package typings.winrtDashUwp.Windows.Devices.Custom

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Custom.IOControlBufferingMethod.buffered
import typings.winrtDashUwp.Windows.Devices.Custom.IOControlBufferingMethod.directInput
import typings.winrtDashUwp.Windows.Devices.Custom.IOControlBufferingMethod.directOutput
import typings.winrtDashUwp.Windows.Devices.Custom.IOControlBufferingMethod.neither
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IOControlBufferingMethod extends js.Object

/** Identifies the buffering method. */
@JSGlobal("Windows.Devices.Custom.IOControlBufferingMethod")
@js.native
object IOControlBufferingMethod extends js.Object {
  /** Buffered. */
  @js.native
  sealed trait buffered extends IOControlBufferingMethod
  
  /** Direct input. */
  @js.native
  sealed trait directInput extends IOControlBufferingMethod
  
  /** Direct output. */
  @js.native
  sealed trait directOutput extends IOControlBufferingMethod
  
  /** Neither. */
  @js.native
  sealed trait neither extends IOControlBufferingMethod
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IOControlBufferingMethod with Double] = js.native
  /* 0 */ @js.native
  object buffered extends TopLevel[buffered with Double]
  
  /* 1 */ @js.native
  object directInput extends TopLevel[directInput with Double]
  
  /* 2 */ @js.native
  object directOutput extends TopLevel[directOutput with Double]
  
  /* 3 */ @js.native
  object neither extends TopLevel[neither with Double]
  
}

