package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnderlineType extends StObject
/** Specifies the type of character underlining. */
@JSGlobal("Windows.UI.Text.UnderlineType")
@js.native
object UnderlineType extends StObject {
  
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
}
