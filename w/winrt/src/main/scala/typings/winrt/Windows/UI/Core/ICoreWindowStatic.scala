package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowStatic extends js.Object {
  def getForCurrentThread(): CoreWindow
}

object ICoreWindowStatic {
  @scala.inline
  def apply(getForCurrentThread: () => CoreWindow): ICoreWindowStatic = {
    val __obj = js.Dynamic.literal(getForCurrentThread = js.Any.fromFunction0(getForCurrentThread))
  
    __obj.asInstanceOf[ICoreWindowStatic]
  }
}

