package typings.winrtDashUwp.Windows.UI.Text.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 2 */ val compositionConverted: typings.winrtDashUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionConverted with Double = js.native
  /* 4 */ val compositionTargetConverted: typings.winrtDashUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionTargetConverted with Double = js.native
  /* 3 */ val compositionTargetUnconverted: typings.winrtDashUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionTargetUnconverted with Double = js.native
  /* 1 */ val compositionUnconverted: typings.winrtDashUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionUnconverted with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreTextFormatUpdatingReason with Double] = js.native
}

