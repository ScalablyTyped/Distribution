package typings.winrtDashUwp.WindowsNs.UINs.TextNs

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
  
  /* 6 */ val dash: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.dash with Double = js.native
  /* 7 */ val dashDot: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.dashDot with Double = js.native
  /* 8 */ val dashDotDot: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.dashDotDot with Double = js.native
  /* 5 */ val dotted: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.dotted with Double = js.native
  /* 4 */ val double: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.double with Double = js.native
  /* 12 */ val doubleWave: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.doubleWave with Double = js.native
  /* 13 */ val heavyWave: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.heavyWave with Double = js.native
  /* 14 */ val longDash: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.longDash with Double = js.native
  /* 1 */ val none: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.none with Double = js.native
  /* 2 */ val single: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.single with Double = js.native
  /* 10 */ val thick: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.thick with Double = js.native
  /* 15 */ val thickDash: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.thickDash with Double = js.native
  /* 16 */ val thickDashDot: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.thickDashDot with Double = js.native
  /* 17 */ val thickDashDotDot: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.thickDashDotDot with Double = js.native
  /* 18 */ val thickDotted: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.thickDotted with Double = js.native
  /* 19 */ val thickLongDash: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.thickLongDash with Double = js.native
  /* 11 */ val thin: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.thin with Double = js.native
  /* 0 */ val undefined: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.undefined with Double = js.native
  /* 9 */ val wave: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.wave with Double = js.native
  /* 3 */ val words: typings.winrtDashUwp.WindowsNs.UINs.TextNs.UnderlineType.words with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnderlineType with Double] = js.native
}

