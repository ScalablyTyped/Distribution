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
  
  val dash: dash with java.lang.String = js.native
  val dashDot: dashDot with java.lang.String = js.native
  val dashDotDot: dashDotDot with java.lang.String = js.native
  val dotted: dotted with java.lang.String = js.native
  val double: double with java.lang.String = js.native
  val doubleWave: doubleWave with java.lang.String = js.native
  val heavyWave: heavyWave with java.lang.String = js.native
  val longDash: longDash with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val single: single with java.lang.String = js.native
  val thick: thick with java.lang.String = js.native
  val thickDash: thickDash with java.lang.String = js.native
  val thickDashDot: thickDashDot with java.lang.String = js.native
  val thickDashDotDot: thickDashDotDot with java.lang.String = js.native
  val thickDotted: thickDotted with java.lang.String = js.native
  val thickLongDash: thickLongDash with java.lang.String = js.native
  val thin: thin with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  val wave: wave with java.lang.String = js.native
  val words: words with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.UnderlineType with java.lang.String] = js.native
}

