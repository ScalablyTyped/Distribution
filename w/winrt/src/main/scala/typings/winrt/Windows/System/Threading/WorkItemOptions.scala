package typings.winrt.Windows.System.Threading

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemOptions extends js.Object

@JSGlobal("Windows.System.Threading.WorkItemOptions")
@js.native
object WorkItemOptions extends js.Object {
  @js.native
  sealed trait none extends WorkItemOptions
  
  @js.native
  sealed trait timeSliced extends WorkItemOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemOptions with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object timeSliced extends TopLevel[timeSliced with Double]
  
}

