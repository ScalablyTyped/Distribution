package typings.winrtDashUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.Text.CaretType.`null`
import typings.winrtDashUwp.Windows.UI.Text.CaretType.normal
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CaretType with Double] = js.native
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 1 */ @js.native
  object `null` extends TopLevel[`null` with Double]
  
}

