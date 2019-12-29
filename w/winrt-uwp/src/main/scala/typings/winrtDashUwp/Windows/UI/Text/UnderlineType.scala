package typings.winrtDashUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnderlineType extends js.Object

/** Specifies the type of character underlining. */
@JSGlobal("Windows.UI.Text.UnderlineType")
@js.native
object UnderlineType extends js.Object {
  /** A dashed line. */
  @js.native
  sealed trait dash extends UnderlineType
  
  /** Alternating dashes and dots. */
  @js.native
  sealed trait dashDot extends UnderlineType
  
  /** Single dashes, each followed by two dots. */
  @js.native
  sealed trait dashDotDot extends UnderlineType
  
  /** A dotted line. */
  @js.native
  sealed trait dotted extends UnderlineType
  
  /** Two solid double lines. */
  @js.native
  sealed trait double extends UnderlineType
  
  /** Two wavy lines. */
  @js.native
  sealed trait doubleWave extends UnderlineType
  
  /** A thick wavy line. */
  @js.native
  sealed trait heavyWave extends UnderlineType
  
  /** Long dashes. */
  @js.native
  sealed trait longDash extends UnderlineType
  
  /** Characters are not underlined. */
  @js.native
  sealed trait none extends UnderlineType
  
  /** A single solid line. */
  @js.native
  sealed trait single extends UnderlineType
  
  /** A thick solid line. */
  @js.native
  sealed trait thick extends UnderlineType
  
  /** Thick dashes. */
  @js.native
  sealed trait thickDash extends UnderlineType
  
  /** Thick, alternating dashes and dots. */
  @js.native
  sealed trait thickDashDot extends UnderlineType
  
  /** Thick single dashes, each followed by two thick dots. */
  @js.native
  sealed trait thickDashDotDot extends UnderlineType
  
  /** A thick dotted line. */
  @js.native
  sealed trait thickDotted extends UnderlineType
  
  /** Thick long dashes. */
  @js.native
  sealed trait thickLongDash extends UnderlineType
  
  /** A thin solid line. */
  @js.native
  sealed trait thin extends UnderlineType
  
  /** No underline type is defined. */
  @js.native
  sealed trait undefined extends UnderlineType
  
  /** A wavy line. */
  @js.native
  sealed trait wave extends UnderlineType
  
  /** Underline words, but not the spaces between words. */
  @js.native
  sealed trait words extends UnderlineType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnderlineType with Double] = js.native
  /* 6 */ @js.native
  object dash extends TopLevel[dash with Double]
  
  /* 7 */ @js.native
  object dashDot extends TopLevel[dashDot with Double]
  
  /* 8 */ @js.native
  object dashDotDot extends TopLevel[dashDotDot with Double]
  
  /* 5 */ @js.native
  object dotted extends TopLevel[dotted with Double]
  
  /* 4 */ @js.native
  object double extends TopLevel[double with Double]
  
  /* 12 */ @js.native
  object doubleWave extends TopLevel[doubleWave with Double]
  
  /* 13 */ @js.native
  object heavyWave extends TopLevel[heavyWave with Double]
  
  /* 14 */ @js.native
  object longDash extends TopLevel[longDash with Double]
  
  /* 1 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object single extends TopLevel[single with Double]
  
  /* 10 */ @js.native
  object thick extends TopLevel[thick with Double]
  
  /* 15 */ @js.native
  object thickDash extends TopLevel[thickDash with Double]
  
  /* 16 */ @js.native
  object thickDashDot extends TopLevel[thickDashDot with Double]
  
  /* 17 */ @js.native
  object thickDashDotDot extends TopLevel[thickDashDotDot with Double]
  
  /* 18 */ @js.native
  object thickDotted extends TopLevel[thickDotted with Double]
  
  /* 19 */ @js.native
  object thickLongDash extends TopLevel[thickLongDash with Double]
  
  /* 11 */ @js.native
  object thin extends TopLevel[thin with Double]
  
  /* 0 */ @js.native
  object undefined extends TopLevel[undefined with Double]
  
  /* 9 */ @js.native
  object wave extends TopLevel[wave with Double]
  
  /* 3 */ @js.native
  object words extends TopLevel[words with Double]
  
}

