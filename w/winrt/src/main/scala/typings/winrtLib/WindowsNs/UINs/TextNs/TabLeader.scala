package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabLeader extends js.Object

@JSGlobal("Windows.UI.Text.TabLeader")
@js.native
object TabLeader extends js.Object {
  @js.native
  sealed trait dashes
    extends winrtLib.WindowsNs.UINs.TextNs.TabLeader
  
  @js.native
  sealed trait dots
    extends winrtLib.WindowsNs.UINs.TextNs.TabLeader
  
  @js.native
  sealed trait equals
    extends winrtLib.WindowsNs.UINs.TextNs.TabLeader
  
  @js.native
  sealed trait lines
    extends winrtLib.WindowsNs.UINs.TextNs.TabLeader
  
  @js.native
  sealed trait spaces
    extends winrtLib.WindowsNs.UINs.TextNs.TabLeader
  
  @js.native
  sealed trait thickLines
    extends winrtLib.WindowsNs.UINs.TextNs.TabLeader
  
  /* 2 */ val dashes: dashes with scala.Double = js.native
  /* 1 */ val dots: dots with scala.Double = js.native
  /* 5 */ @JSName("equals")
  val equals_FTabLeader: equals with scala.Double = js.native
  /* 3 */ val lines: lines with scala.Double = js.native
  /* 0 */ val spaces: spaces with scala.Double = js.native
  /* 4 */ val thickLines: thickLines with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.TabLeader with scala.Double] = js.native
}

