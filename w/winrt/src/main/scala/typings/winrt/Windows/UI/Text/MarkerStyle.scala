package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
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

