package typings.winrt.WindowsNs.SystemNs.ThreadingNs.CoreNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreallocatedWorkItem extends js.Object {
  def runAsync(): IAsyncAction
}

object IPreallocatedWorkItem {
  @scala.inline
  def apply(runAsync: () => IAsyncAction): IPreallocatedWorkItem = {
    val __obj = js.Dynamic.literal(runAsync = js.Any.fromFunction0(runAsync))
  
    __obj.asInstanceOf[IPreallocatedWorkItem]
  }
}

