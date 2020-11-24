package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreWindowResizeManager extends ICoreWindowResizeManager
object CoreWindowResizeManager {
  
  @scala.inline
  def apply(notifyLayoutCompleted: () => Unit): CoreWindowResizeManager = {
    val __obj = js.Dynamic.literal(notifyLayoutCompleted = js.Any.fromFunction0(notifyLayoutCompleted))
    __obj.asInstanceOf[CoreWindowResizeManager]
  }
}
