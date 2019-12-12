package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Text.RangeGravity.backward
import typings.winrt.Windows.UI.Text.RangeGravity.forward
import typings.winrt.Windows.UI.Text.RangeGravity.inward
import typings.winrt.Windows.UI.Text.RangeGravity.outward
import typings.winrt.Windows.UI.Text.RangeGravity.uIBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeGravity extends js.Object

@JSGlobal("Windows.UI.Text.RangeGravity")
@js.native
object RangeGravity extends js.Object {
  @js.native
  sealed trait backward extends RangeGravity
  
  @js.native
  sealed trait forward extends RangeGravity
  
  @js.native
  sealed trait inward extends RangeGravity
  
  @js.native
  sealed trait outward extends RangeGravity
  
  @js.native
  sealed trait uIBehavior extends RangeGravity
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RangeGravity with Double] = js.native
  /* 1 */ @js.native
  object backward extends TopLevel[backward with Double]
  
  /* 2 */ @js.native
  object forward extends TopLevel[forward with Double]
  
  /* 3 */ @js.native
  object inward extends TopLevel[inward with Double]
  
  /* 4 */ @js.native
  object outward extends TopLevel[outward with Double]
  
  /* 0 */ @js.native
  object uIBehavior extends TopLevel[uIBehavior with Double]
  
}

