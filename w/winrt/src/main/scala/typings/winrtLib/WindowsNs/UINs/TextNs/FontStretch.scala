package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStretch extends js.Object

@JSGlobal("Windows.UI.Text.FontStretch")
@js.native
object FontStretch extends js.Object {
  @js.native
  sealed trait condensed
    extends winrtLib.WindowsNs.UINs.TextNs.FontStretch
  
  @js.native
  sealed trait expanded
    extends winrtLib.WindowsNs.UINs.TextNs.FontStretch
  
  @js.native
  sealed trait extraCondensed
    extends winrtLib.WindowsNs.UINs.TextNs.FontStretch
  
  @js.native
  sealed trait extraExpanded
    extends winrtLib.WindowsNs.UINs.TextNs.FontStretch
  
  @js.native
  sealed trait normal
    extends winrtLib.WindowsNs.UINs.TextNs.FontStretch
  
  @js.native
  sealed trait semiCondensed
    extends winrtLib.WindowsNs.UINs.TextNs.FontStretch
  
  @js.native
  sealed trait semiExpanded
    extends winrtLib.WindowsNs.UINs.TextNs.FontStretch
  
  @js.native
  sealed trait ultraCondensed
    extends winrtLib.WindowsNs.UINs.TextNs.FontStretch
  
  @js.native
  sealed trait ultraExpanded
    extends winrtLib.WindowsNs.UINs.TextNs.FontStretch
  
  @js.native
  sealed trait undefined
    extends winrtLib.WindowsNs.UINs.TextNs.FontStretch
  
  /* 3 */ val condensed: condensed with scala.Double = js.native
  /* 7 */ val expanded: expanded with scala.Double = js.native
  /* 2 */ val extraCondensed: extraCondensed with scala.Double = js.native
  /* 8 */ val extraExpanded: extraExpanded with scala.Double = js.native
  /* 5 */ val normal: normal with scala.Double = js.native
  /* 4 */ val semiCondensed: semiCondensed with scala.Double = js.native
  /* 6 */ val semiExpanded: semiExpanded with scala.Double = js.native
  /* 1 */ val ultraCondensed: ultraCondensed with scala.Double = js.native
  /* 9 */ val ultraExpanded: ultraExpanded with scala.Double = js.native
  /* 0 */ val undefined: undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.FontStretch with scala.Double] = js.native
}

