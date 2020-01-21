package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemMediaTransportControlsProperty extends js.Object

/** Defines values for the properties on the SystemMediaTransportControls . */
@JSGlobal("Windows.Media.SystemMediaTransportControlsProperty")
@js.native
object SystemMediaTransportControlsProperty extends js.Object {
  /** The sound level property. */
  @js.native
  sealed trait soundLevel extends SystemMediaTransportControlsProperty
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SystemMediaTransportControlsProperty with Double] = js.native
  /* 0 */ @js.native
  object soundLevel extends TopLevel[soundLevel with Double]
  
}

