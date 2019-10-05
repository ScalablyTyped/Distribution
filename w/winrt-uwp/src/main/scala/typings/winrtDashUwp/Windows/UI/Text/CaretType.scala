package typings.winrtDashUwp.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CaretType extends js.Object

/** Specifies the caret type. */
@JSGlobal("Windows.UI.Text.CaretType")
@js.native
object CaretType extends js.Object {
  /** The insertion point for a sequenced language; that is, characters that are typed with one key stroke. */
  @js.native
  sealed trait normal extends CaretType
  
  /** The insertion point is null. */
  @js.native
  sealed trait `null` extends CaretType
  
  /* 0 */ val normal: typings.winrtDashUwp.Windows.UI.Text.CaretType.normal with Double = js.native
  /* 1 */ val `null`: typings.winrtDashUwp.Windows.UI.Text.CaretType.`null` with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CaretType with Double] = js.native
}

