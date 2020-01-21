package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStretch with Double] = js.native
  /* 3 */ @js.native
  object condensed extends TopLevel[condensed with Double]
  
  /* 7 */ @js.native
  object expanded extends TopLevel[expanded with Double]
  
  /* 2 */ @js.native
  object extraCondensed extends TopLevel[extraCondensed with Double]
  
  /* 8 */ @js.native
  object extraExpanded extends TopLevel[extraExpanded with Double]
  
  /* 5 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 4 */ @js.native
  object semiCondensed extends TopLevel[semiCondensed with Double]
  
  /* 6 */ @js.native
  object semiExpanded extends TopLevel[semiExpanded with Double]
  
  /* 1 */ @js.native
  object ultraCondensed extends TopLevel[ultraCondensed with Double]
  
  /* 9 */ @js.native
  object ultraExpanded extends TopLevel[ultraExpanded with Double]
  
  /* 0 */ @js.native
  object undefined extends TopLevel[undefined with Double]
  
}

