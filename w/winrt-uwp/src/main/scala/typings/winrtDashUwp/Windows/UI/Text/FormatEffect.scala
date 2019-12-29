package typings.winrtDashUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormatEffect extends js.Object

/** Defines values that indicate the state of a character or paragraph formatting property. */
@JSGlobal("Windows.UI.Text.FormatEffect")
@js.native
object FormatEffect extends js.Object {
  /** Turns off the property. */
  @js.native
  sealed trait off extends FormatEffect
  
  /** Turns on the property. */
  @js.native
  sealed trait on extends FormatEffect
  
  /** Toggles the current setting. */
  @js.native
  sealed trait toggle extends FormatEffect
  
  /** No change. */
  @js.native
  sealed trait undefined extends FormatEffect
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormatEffect with Double] = js.native
  /* 0 */ @js.native
  object off extends TopLevel[off with Double]
  
  /* 1 */ @js.native
  object on extends TopLevel[on with Double]
  
  /* 2 */ @js.native
  object toggle extends TopLevel[toggle with Double]
  
  /* 3 */ @js.native
  object undefined extends TopLevel[undefined with Double]
  
}

