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
  def apply(runAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncAction): IPreallocatedWorkItem = {
    val __obj = js.Dynamic.literal(runAsync = js.Any.fromFunction0(runAsync))
  
    __obj.asInstanceOf[IPreallocatedWorkItem]
  }
}

