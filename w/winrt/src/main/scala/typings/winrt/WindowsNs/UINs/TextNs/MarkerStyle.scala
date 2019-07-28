package typings.winrt.WindowsNs.UINs.TextNs

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
  
  /* 5 */ val minus: typings.winrt.WindowsNs.UINs.TextNs.MarkerStyle.minus with Double = js.native
  /* 6 */ val noNumber: typings.winrt.WindowsNs.UINs.TextNs.MarkerStyle.noNumber with Double = js.native
  /* 2 */ val parentheses: typings.winrt.WindowsNs.UINs.TextNs.MarkerStyle.parentheses with Double = js.native
  /* 1 */ val parenthesis: typings.winrt.WindowsNs.UINs.TextNs.MarkerStyle.parenthesis with Double = js.native
  /* 3 */ val period: typings.winrt.WindowsNs.UINs.TextNs.MarkerStyle.period with Double = js.native
  /* 4 */ val plain: typings.winrt.WindowsNs.UINs.TextNs.MarkerStyle.plain with Double = js.native
  /* 0 */ val undefined: typings.winrt.WindowsNs.UINs.TextNs.MarkerStyle.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerStyle with Double] = js.native
}

