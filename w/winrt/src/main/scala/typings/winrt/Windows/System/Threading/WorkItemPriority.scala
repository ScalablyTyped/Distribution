package typings.winrt.Windows.System.Threading

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.System.Threading.WorkItemPriority.high
import typings.winrt.Windows.System.Threading.WorkItemPriority.low
import typings.winrt.Windows.System.Threading.WorkItemPriority.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemPriority extends js.Object

@JSGlobal("Windows.System.Threading.WorkItemPriority")
@js.native
object WorkItemPriority extends js.Object {
  @js.native
  sealed trait high extends WorkItemPriority
  
  @js.native
  sealed trait low extends WorkItemPriority
  
  @js.native
  sealed trait normal extends WorkItemPriority
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemPriority with Double] = js.native
  /* 2 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 0 */ @js.native
  object low extends TopLevel[low with Double]
  
  /* 1 */ @js.native
  object normal extends TopLevel[normal with Double]
  
}

