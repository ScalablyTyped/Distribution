package typings.winrtUwp.Windows.UI.Text.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoreTextFormatUpdatingReason extends js.Object
/** Defines constants that specify the set of state applied during text composition. */
@JSGlobal("Windows.UI.Text.Core.CoreTextFormatUpdatingReason")
@js.native
object CoreTextFormatUpdatingReason extends js.Object {
  
  /** The text is a converted composition string. */
  @js.native
  sealed trait compositionConverted extends CoreTextFormatUpdatingReason
  
  /** The user made a selection in the composition string, but the text has not yet been converted. */
  @js.native
  sealed trait compositionTargetConverted extends CoreTextFormatUpdatingReason
  
  /** The user has made a selection in the composition string and the text has been converted. */
  @js.native
  sealed trait compositionTargetUnconverted extends CoreTextFormatUpdatingReason
  
  /** The text is an unconverted composition string. */
  @js.native
  sealed trait compositionUnconverted extends CoreTextFormatUpdatingReason
  
  /** The reason for the format updating is unknown. */
  @js.native
  sealed trait none extends CoreTextFormatUpdatingReason
}
