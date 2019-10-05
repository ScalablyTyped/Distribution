package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerStyle extends js.Object

@JSGlobal("Windows.UI.Text.MarkerStyle")
@js.native
object MarkerStyle extends js.Object {
  @js.native
  sealed trait minus extends MarkerStyle
  
  @js.native
  sealed trait noNumber extends MarkerStyle
  
  @js.native
  sealed trait parentheses extends MarkerStyle
  
  @js.native
  sealed trait parenthesis extends MarkerStyle
  
  @js.native
  sealed trait period extends MarkerStyle
  
  @js.native
  sealed trait plain extends MarkerStyle
  
  @js.native
  sealed trait undefined extends MarkerStyle
  
  /* 5 */ val minus: typings.winrt.Windows.UI.Text.MarkerStyle.minus with Double = js.native
  /* 6 */ val noNumber: typings.winrt.Windows.UI.Text.MarkerStyle.noNumber with Double = js.native
  /* 2 */ val parentheses: typings.winrt.Windows.UI.Text.MarkerStyle.parentheses with Double = js.native
  /* 1 */ val parenthesis: typings.winrt.Windows.UI.Text.MarkerStyle.parenthesis with Double = js.native
  /* 3 */ val period: typings.winrt.Windows.UI.Text.MarkerStyle.period with Double = js.native
  /* 4 */ val plain: typings.winrt.Windows.UI.Text.MarkerStyle.plain with Double = js.native
  /* 0 */ val undefined: typings.winrt.Windows.UI.Text.MarkerStyle.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerStyle with Double] = js.native
}

