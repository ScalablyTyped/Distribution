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
  
  val condensed: condensed with java.lang.String = js.native
  val expanded: expanded with java.lang.String = js.native
  val extraCondensed: extraCondensed with java.lang.String = js.native
  val extraExpanded: extraExpanded with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  val semiCondensed: semiCondensed with java.lang.String = js.native
  val semiExpanded: semiExpanded with java.lang.String = js.native
  val ultraCondensed: ultraCondensed with java.lang.String = js.native
  val ultraExpanded: ultraExpanded with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.FontStretch with java.lang.String] = js.native
}

