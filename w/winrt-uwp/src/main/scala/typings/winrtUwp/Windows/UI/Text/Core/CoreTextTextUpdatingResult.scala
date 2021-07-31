package typings.winrtUwp.Windows.UI.Text.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoreTextTextUpdatingResult extends StObject
/** Defines constants that specify the result of handling the TextUpdating event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextTextUpdatingResult")
@js.native
object CoreTextTextUpdatingResult extends StObject {
  
  /** The text update operation was not completed as the text input server expected. The state of the text input control is unchanged. */
  @js.native
  sealed trait failed
    extends StObject
       with CoreTextTextUpdatingResult
  
  /** The text update operation completed successfully. */
  @js.native
  sealed trait succeeded
    extends StObject
       with CoreTextTextUpdatingResult
}
