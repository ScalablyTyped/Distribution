package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

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
  sealed trait compositionConverted
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextFormatUpdatingReason
  
  /** The user made a selection in the composition string, but the text has not yet been converted. */
  @js.native
  sealed trait compositionTargetConverted
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextFormatUpdatingReason
  
  /** The user has made a selection in the composition string and the text has been converted. */
  @js.native
  sealed trait compositionTargetUnconverted
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextFormatUpdatingReason
  
  /** The text is an unconverted composition string. */
  @js.native
  sealed trait compositionUnconverted
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextFormatUpdatingReason
  
  /** The reason for the format updating is unknown. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextFormatUpdatingReason
  
  /* 2 */ val compositionConverted: compositionConverted with scala.Double = js.native
  /* 4 */ val compositionTargetConverted: compositionTargetConverted with scala.Double = js.native
  /* 3 */ val compositionTargetUnconverted: compositionTargetUnconverted with scala.Double = js.native
  /* 1 */ val compositionUnconverted: compositionUnconverted with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextFormatUpdatingReason with scala.Double
  ] = js.native
}

