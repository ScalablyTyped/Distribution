package typings
package winrtLib.WindowsNs.SystemNs.ThreadingNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreallocatedWorkItem extends js.Object {
  def runAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction
}

object IPreallocatedWorkItem {
  @scala.inline
  def apply(runAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncAction]): IPreallocatedWorkItem = {
    val __obj = js.Dynamic.literal(runAsync = runAsync)
  
    __obj.asInstanceOf[IPreallocatedWorkItem]
  }
}

