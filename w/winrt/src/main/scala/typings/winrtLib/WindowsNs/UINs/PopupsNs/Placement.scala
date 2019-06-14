package typings
package winrtLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Placement extends js.Object

@JSGlobal("Windows.UI.Popups.Placement")
@js.native
object Placement extends js.Object {
  @js.native
  sealed trait above
    extends winrtLib.WindowsNs.UINs.PopupsNs.Placement
  
  @js.native
  sealed trait below
    extends winrtLib.WindowsNs.UINs.PopupsNs.Placement
  
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.UINs.PopupsNs.Placement
  
  @js.native
  sealed trait left
    extends winrtLib.WindowsNs.UINs.PopupsNs.Placement
  
  @js.native
  sealed trait right
    extends winrtLib.WindowsNs.UINs.PopupsNs.Placement
  
  /* 1 */ val above: above with scala.Double = js.native
  /* 2 */ val below: below with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 3 */ val left: left with scala.Double = js.native
  /* 4 */ val right: right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.PopupsNs.Placement with scala.Double] = js.native
}

