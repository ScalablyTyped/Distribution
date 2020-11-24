package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Panel extends js.Object
/** Indicates the location of a panel on a computer. This enumeration is used for indicating the physical location of a device. */
@JSGlobal("Windows.Devices.Enumeration.Panel")
@js.native
object Panel extends js.Object {
  
  /** The back panel of the computer. */
  @js.native
  sealed trait back extends Panel
  
  /** The bottom panel of the computer. */
  @js.native
  sealed trait bottom extends Panel
  
  /** The front panel of the computer. */
  @js.native
  sealed trait front extends Panel
  
  /** The left panel of the computer. */
  @js.native
  sealed trait left extends Panel
  
  /** The right panel of the computer. */
  @js.native
  sealed trait right extends Panel
  
  /** The top panel of the computer. */
  @js.native
  sealed trait top extends Panel
  
  /** The location of the panel is unknown. */
  @js.native
  sealed trait unknown extends Panel
}
