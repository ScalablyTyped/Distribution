package typings.winrt.Windows.UI.Popups

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Placement extends js.Object

@JSGlobal("Windows.UI.Popups.Placement")
@js.native
object Placement extends js.Object {
  @js.native
  sealed trait above extends Placement
  
  @js.native
  sealed trait below extends Placement
  
  @js.native
  sealed trait default extends Placement
  
  @js.native
  sealed trait left extends Placement
  
  @js.native
  sealed trait right extends Placement
  
}

