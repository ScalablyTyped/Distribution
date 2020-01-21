package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Panel with Double] = js.native
  /* 2 */ @js.native
  object back extends TopLevel[back with Double]
  
  /* 4 */ @js.native
  object bottom extends TopLevel[bottom with Double]
  
  /* 1 */ @js.native
  object front extends TopLevel[front with Double]
  
  /* 5 */ @js.native
  object left extends TopLevel[left with Double]
  
  /* 6 */ @js.native
  object right extends TopLevel[right with Double]
  
  /* 3 */ @js.native
  object top extends TopLevel[top with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

