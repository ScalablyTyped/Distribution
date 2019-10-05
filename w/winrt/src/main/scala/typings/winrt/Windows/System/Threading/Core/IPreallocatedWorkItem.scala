package typings.winrt.Windows.System.Threading.Core

import typings.winrt.Windows.Foundation.IAsyncAction
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

