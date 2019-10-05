package typings.winrtDashUwp.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FindOptions extends js.Object

/** Specifies the options to use when doing a text search. */
@JSGlobal("Windows.UI.Text.FindOptions")
@js.native
object FindOptions extends js.Object {
  /** Match case; that is, a case-sensitive search. */
  @js.native
  sealed trait `case` extends FindOptions
  
  /** Use the default text search options; namely, use case- independent, arbitrary character boundaries. */
  @js.native
  sealed trait none extends FindOptions
  
  /** Match whole words. */
  @js.native
  sealed trait word extends FindOptions
  
  /* 2 */ val `case`: typings.winrtDashUwp.Windows.UI.Text.FindOptions.`case` with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.UI.Text.FindOptions.none with Double = js.native
  /* 1 */ val word: typings.winrtDashUwp.Windows.UI.Text.FindOptions.word with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FindOptions with Double] = js.native
}

