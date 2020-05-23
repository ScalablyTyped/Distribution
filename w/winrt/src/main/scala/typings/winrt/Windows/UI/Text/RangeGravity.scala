package typings.winrt.Windows.UI.Text

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
  
}

