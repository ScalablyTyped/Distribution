package typings.winrt.Windows.System.Threading

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
