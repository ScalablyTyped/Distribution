package typings.winrt.Windows.System.Threading.Core

import typings.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreallocatedWorkItem extends IPreallocatedWorkItem

object PreallocatedWorkItem {
  @scala.inline
  def apply(runAsync: () => IAsyncAction): PreallocatedWorkItem = {
    val __obj = js.Dynamic.literal(runAsync = js.Any.fromFunction0(runAsync))
    __obj.asInstanceOf[PreallocatedWorkItem]
  }
}

