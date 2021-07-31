package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LetterCase extends StObject
/** Represents the character case formatting. */
@JSGlobal("Windows.UI.Text.LetterCase")
@js.native
object LetterCase extends StObject {
  
  /** Lowercase characters. */
  @js.native
  sealed trait lower
    extends StObject
       with LetterCase
  
  /** Uppercase characters. */
  @js.native
  sealed trait upper
    extends StObject
       with LetterCase
}
