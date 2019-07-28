package typings.winrtDashUwp.WindowsNs.UINs.TextNs

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
  sealed trait condensed extends FontStretch
  
  /** An expanded font stretch (125% of normal). */
  @js.native
  sealed trait expanded extends FontStretch
  
  /** An extra-condensed font stretch (62.5% of normal). */
  @js.native
  sealed trait extraCondensed extends FontStretch
  
  /** An extra-expanded font stretch (150% of normal). */
  @js.native
  sealed trait extraExpanded extends FontStretch
  
  /** The normal font stretch that all other font stretch values relate to (100%). */
  @js.native
  sealed trait normal extends FontStretch
  
  /** A semi-condensed font stretch (87.5% of normal). */
  @js.native
  sealed trait semiCondensed extends FontStretch
  
  /** A semi-expanded font stretch (112.5% of normal). */
  @js.native
  sealed trait semiExpanded extends FontStretch
  
  /** An ultra-condensed font stretch (50% of normal). */
  @js.native
  sealed trait ultraCondensed extends FontStretch
  
  /** An ultra-expanded font stretch (200% of normal). */
  @js.native
  sealed trait ultraExpanded extends FontStretch
  
  /** No defined font stretch. */
  @js.native
  sealed trait undefined extends FontStretch
  
  /* 3 */ val condensed: typings.winrtDashUwp.WindowsNs.UINs.TextNs.FontStretch.condensed with Double = js.native
  /* 7 */ val expanded: typings.winrtDashUwp.WindowsNs.UINs.TextNs.FontStretch.expanded with Double = js.native
  /* 2 */ val extraCondensed: typings.winrtDashUwp.WindowsNs.UINs.TextNs.FontStretch.extraCondensed with Double = js.native
  /* 8 */ val extraExpanded: typings.winrtDashUwp.WindowsNs.UINs.TextNs.FontStretch.extraExpanded with Double = js.native
  /* 5 */ val normal: typings.winrtDashUwp.WindowsNs.UINs.TextNs.FontStretch.normal with Double = js.native
  /* 4 */ val semiCondensed: typings.winrtDashUwp.WindowsNs.UINs.TextNs.FontStretch.semiCondensed with Double = js.native
  /* 6 */ val semiExpanded: typings.winrtDashUwp.WindowsNs.UINs.TextNs.FontStretch.semiExpanded with Double = js.native
  /* 1 */ val ultraCondensed: typings.winrtDashUwp.WindowsNs.UINs.TextNs.FontStretch.ultraCondensed with Double = js.native
  /* 9 */ val ultraExpanded: typings.winrtDashUwp.WindowsNs.UINs.TextNs.FontStretch.ultraExpanded with Double = js.native
  /* 0 */ val undefined: typings.winrtDashUwp.WindowsNs.UINs.TextNs.FontStretch.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStretch with Double] = js.native
}

