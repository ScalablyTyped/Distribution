package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

@JSGlobal("Windows.UI.Text.FontStyle")
@js.native
object FontStyle extends js.Object {
  @js.native
  sealed trait italic extends FontStyle
  
  @js.native
  sealed trait normal extends FontStyle
  
  @js.native
  sealed trait oblique extends FontStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStyle with Double] = js.native
  /* 2 */ @js.native
  object italic extends TopLevel[italic with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 1 */ @js.native
  object oblique extends TopLevel[oblique with Double]
  
}

