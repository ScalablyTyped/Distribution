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
  
  val above: above with java.lang.String = js.native
  val below: below with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val left: left with java.lang.String = js.native
  val right: right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.PopupsNs.Placement with java.lang.String] = js.native
}

