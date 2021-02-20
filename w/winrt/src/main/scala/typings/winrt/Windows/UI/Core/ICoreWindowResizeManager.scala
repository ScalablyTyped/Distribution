package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoreWindowResizeManager extends StObject {
  
  def notifyLayoutCompleted(): Unit = js.native
}
object ICoreWindowResizeManager {
  
  @scala.inline
  def apply(notifyLayoutCompleted: () => Unit): ICoreWindowResizeManager = {
    val __obj = js.Dynamic.literal(notifyLayoutCompleted = js.Any.fromFunction0(notifyLayoutCompleted))
    __obj.asInstanceOf[ICoreWindowResizeManager]
  }
  
  @scala.inline
  implicit class ICoreWindowResizeManagerMutableBuilder[Self <: ICoreWindowResizeManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifyLayoutCompleted(value: () => Unit): Self = StObject.set(x, "notifyLayoutCompleted", js.Any.fromFunction0(value))
  }
}
