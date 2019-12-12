package typings.winrtDashUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.Text.MarkerStyle.minus
import typings.winrtDashUwp.Windows.UI.Text.MarkerStyle.noNumber
import typings.winrtDashUwp.Windows.UI.Text.MarkerStyle.parentheses
import typings.winrtDashUwp.Windows.UI.Text.MarkerStyle.parenthesis
import typings.winrtDashUwp.Windows.UI.Text.MarkerStyle.period
import typings.winrtDashUwp.Windows.UI.Text.MarkerStyle.plain
import typings.winrtDashUwp.Windows.UI.Text.MarkerStyle.undefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerStyle extends js.Object

/** Specifies the style used to mark the item paragraphs in a list. */
@JSGlobal("Windows.UI.Text.MarkerStyle")
@js.native
object MarkerStyle extends js.Object {
  /** The item marker is followed by a hyphen (-). */
  @js.native
  sealed trait minus extends MarkerStyle
  
  /** The items have no markers. */
  @js.native
  sealed trait noNumber extends MarkerStyle
  
  /** The item marker is enclosed in parentheses, as in (1). */
  @js.native
  sealed trait parentheses extends MarkerStyle
  
  /** The item marker is followed by a parenthesis, as in 1). */
  @js.native
  sealed trait parenthesis extends MarkerStyle
  
  /** The item marker is followed by a period. */
  @js.native
  sealed trait period extends MarkerStyle
  
  /** The item marker appears by itself. */
  @js.native
  sealed trait plain extends MarkerStyle
  
  /** The marker style is not defined. */
  @js.native
  sealed trait undefined extends MarkerStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerStyle with Double] = js.native
  /* 5 */ @js.native
  object minus extends TopLevel[minus with Double]
  
  /* 6 */ @js.native
  object noNumber extends TopLevel[noNumber with Double]
  
  /* 2 */ @js.native
  object parentheses extends TopLevel[parentheses with Double]
  
  /* 1 */ @js.native
  object parenthesis extends TopLevel[parenthesis with Double]
  
  /* 3 */ @js.native
  object period extends TopLevel[period with Double]
  
  /* 4 */ @js.native
  object plain extends TopLevel[plain with Double]
  
  /* 0 */ @js.native
  object undefined extends TopLevel[undefined with Double]
  
}

