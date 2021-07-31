package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnderlineType extends StObject
/** Specifies the type of character underlining. */
@JSGlobal("Windows.UI.Text.UnderlineType")
@js.native
object UnderlineType extends StObject {
  
  /** A dashed line. */
  @js.native
  sealed trait dash
    extends StObject
       with UnderlineType
  
  /** Alternating dashes and dots. */
  @js.native
  sealed trait dashDot
    extends StObject
       with UnderlineType
  
  /** Single dashes, each followed by two dots. */
  @js.native
  sealed trait dashDotDot
    extends StObject
       with UnderlineType
  
  /** A dotted line. */
  @js.native
  sealed trait dotted
    extends StObject
       with UnderlineType
  
  /** Two solid double lines. */
  @js.native
  sealed trait double
    extends StObject
       with UnderlineType
  
  /** Two wavy lines. */
  @js.native
  sealed trait doubleWave
    extends StObject
       with UnderlineType
  
  /** A thick wavy line. */
  @js.native
  sealed trait heavyWave
    extends StObject
       with UnderlineType
  
  /** Long dashes. */
  @js.native
  sealed trait longDash
    extends StObject
       with UnderlineType
  
  /** Characters are not underlined. */
  @js.native
  sealed trait none
    extends StObject
       with UnderlineType
  
  /** A single solid line. */
  @js.native
  sealed trait single
    extends StObject
       with UnderlineType
  
  /** A thick solid line. */
  @js.native
  sealed trait thick
    extends StObject
       with UnderlineType
  
  /** Thick dashes. */
  @js.native
  sealed trait thickDash
    extends StObject
       with UnderlineType
  
  /** Thick, alternating dashes and dots. */
  @js.native
  sealed trait thickDashDot
    extends StObject
       with UnderlineType
  
  /** Thick single dashes, each followed by two thick dots. */
  @js.native
  sealed trait thickDashDotDot
    extends StObject
       with UnderlineType
  
  /** A thick dotted line. */
  @js.native
  sealed trait thickDotted
    extends StObject
       with UnderlineType
  
  /** Thick long dashes. */
  @js.native
  sealed trait thickLongDash
    extends StObject
       with UnderlineType
  
  /** A thin solid line. */
  @js.native
  sealed trait thin
    extends StObject
       with UnderlineType
  
  /** No underline type is defined. */
  @js.native
  sealed trait undefined
    extends StObject
       with UnderlineType
  
  /** A wavy line. */
  @js.native
  sealed trait wave
    extends StObject
       with UnderlineType
  
  /** Underline words, but not the spaces between words. */
  @js.native
  sealed trait words
    extends StObject
       with UnderlineType
}
