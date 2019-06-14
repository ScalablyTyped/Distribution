package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

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
  sealed trait dash
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** Alternating dashes and dots. */
  @js.native
  sealed trait dashDot
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** Single dashes, each followed by two dots. */
  @js.native
  sealed trait dashDotDot
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** A dotted line. */
  @js.native
  sealed trait dotted
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** Two solid double lines. */
  @js.native
  sealed trait double
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** Two wavy lines. */
  @js.native
  sealed trait doubleWave
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** A thick wavy line. */
  @js.native
  sealed trait heavyWave
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** Long dashes. */
  @js.native
  sealed trait longDash
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** Characters are not underlined. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** A single solid line. */
  @js.native
  sealed trait single
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** A thick solid line. */
  @js.native
  sealed trait thick
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** Thick dashes. */
  @js.native
  sealed trait thickDash
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** Thick, alternating dashes and dots. */
  @js.native
  sealed trait thickDashDot
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** Thick single dashes, each followed by two thick dots. */
  @js.native
  sealed trait thickDashDotDot
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** A thick dotted line. */
  @js.native
  sealed trait thickDotted
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** Thick long dashes. */
  @js.native
  sealed trait thickLongDash
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** A thin solid line. */
  @js.native
  sealed trait thin
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** No underline type is defined. */
  @js.native
  sealed trait undefined
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** A wavy line. */
  @js.native
  sealed trait wave
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /** Underline words, but not the spaces between words. */
  @js.native
  sealed trait words
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType
  
  /* 6 */ val dash: dash with scala.Double = js.native
  /* 7 */ val dashDot: dashDot with scala.Double = js.native
  /* 8 */ val dashDotDot: dashDotDot with scala.Double = js.native
  /* 5 */ val dotted: dotted with scala.Double = js.native
  /* 4 */ val double: double with scala.Double = js.native
  /* 12 */ val doubleWave: doubleWave with scala.Double = js.native
  /* 13 */ val heavyWave: heavyWave with scala.Double = js.native
  /* 14 */ val longDash: longDash with scala.Double = js.native
  /* 1 */ val none: none with scala.Double = js.native
  /* 2 */ val single: single with scala.Double = js.native
  /* 10 */ val thick: thick with scala.Double = js.native
  /* 15 */ val thickDash: thickDash with scala.Double = js.native
  /* 16 */ val thickDashDot: thickDashDot with scala.Double = js.native
  /* 17 */ val thickDashDotDot: thickDashDotDot with scala.Double = js.native
  /* 18 */ val thickDotted: thickDotted with scala.Double = js.native
  /* 19 */ val thickLongDash: thickLongDash with scala.Double = js.native
  /* 11 */ val thin: thin with scala.Double = js.native
  /* 0 */ val undefined: undefined with scala.Double = js.native
  /* 9 */ val wave: wave with scala.Double = js.native
  /* 3 */ val words: words with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType with scala.Double] = js.native
}

