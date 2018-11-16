package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStretch extends js.Object

/** Describes the degree to which a font has been stretched, compared to the normal aspect ratio of that font. */
@JSGlobal("Windows.UI.Text.FontStretch")
@js.native
object FontStretch extends js.Object {
  /** A condensed font stretch (75% of normal). */
  @js.native
  sealed trait condensed
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStretch
  
  /** An expanded font stretch (125% of normal). */
  @js.native
  sealed trait expanded
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStretch
  
  /** An extra-condensed font stretch (62.5% of normal). */
  @js.native
  sealed trait extraCondensed
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStretch
  
  /** An extra-expanded font stretch (150% of normal). */
  @js.native
  sealed trait extraExpanded
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStretch
  
  /** The normal font stretch that all other font stretch values relate to (100%). */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStretch
  
  /** A semi-condensed font stretch (87.5% of normal). */
  @js.native
  sealed trait semiCondensed
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStretch
  
  /** A semi-expanded font stretch (112.5% of normal). */
  @js.native
  sealed trait semiExpanded
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStretch
  
  /** An ultra-condensed font stretch (50% of normal). */
  @js.native
  sealed trait ultraCondensed
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStretch
  
  /** An ultra-expanded font stretch (200% of normal). */
  @js.native
  sealed trait ultraExpanded
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStretch
  
  /** No defined font stretch. */
  @js.native
  sealed trait undefined
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStretch
  
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
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStretch with java.lang.String] = js.native
}

