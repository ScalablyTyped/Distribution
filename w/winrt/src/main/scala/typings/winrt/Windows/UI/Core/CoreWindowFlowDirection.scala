package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreWindowFlowDirection with Double] = js.native
  /* 0 */ @js.native
  object leftToRight extends TopLevel[leftToRight with Double]
  
  /* 1 */ @js.native
  object rightToLeft extends TopLevel[rightToLeft with Double]
  
}

