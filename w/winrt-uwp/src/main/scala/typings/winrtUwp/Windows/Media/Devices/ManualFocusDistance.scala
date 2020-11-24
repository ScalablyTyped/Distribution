package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ManualFocusDistance extends js.Object
/** Defines the options for manual focus distance. */
@JSGlobal("Windows.Media.Devices.ManualFocusDistance")
@js.native
object ManualFocusDistance extends js.Object {
  
  /** Focus to the hyperfocal distance. */
  @js.native
  sealed trait hyperfocal extends ManualFocusDistance
  
  /** Focus to infinity. */
  @js.native
  sealed trait infinity extends ManualFocusDistance
  
  /** Focus to the nearest distance. */
  @js.native
  sealed trait nearest extends ManualFocusDistance
}
