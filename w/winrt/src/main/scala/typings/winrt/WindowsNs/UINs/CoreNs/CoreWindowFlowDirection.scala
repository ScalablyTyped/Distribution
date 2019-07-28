package typings.winrt.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreWindowFlowDirection extends js.Object

@JSGlobal("Windows.UI.Core.CoreWindowFlowDirection")
@js.native
object CoreWindowFlowDirection extends js.Object {
  @js.native
  sealed trait leftToRight extends CoreWindowFlowDirection
  
  @js.native
  sealed trait rightToLeft extends CoreWindowFlowDirection
  
  /* 0 */ val leftToRight: typings.winrt.WindowsNs.UINs.CoreNs.CoreWindowFlowDirection.leftToRight with Double = js.native
  /* 1 */ val rightToLeft: typings.winrt.WindowsNs.UINs.CoreNs.CoreWindowFlowDirection.rightToLeft with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreWindowFlowDirection with Double] = js.native
}

