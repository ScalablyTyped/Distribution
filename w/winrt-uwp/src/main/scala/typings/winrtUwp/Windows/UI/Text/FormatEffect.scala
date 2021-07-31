package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FormatEffect extends StObject
/** Defines values that indicate the state of a character or paragraph formatting property. */
@JSGlobal("Windows.UI.Text.FormatEffect")
@js.native
object FormatEffect extends StObject {
  
  /** Turns off the property. */
  @js.native
  sealed trait off
    extends StObject
       with FormatEffect
  
  /** Turns on the property. */
  @js.native
  sealed trait on
    extends StObject
       with FormatEffect
  
  /** Toggles the current setting. */
  @js.native
  sealed trait toggle
    extends StObject
       with FormatEffect
  
  /** No change. */
  @js.native
  sealed trait undefined
    extends StObject
       with FormatEffect
}
