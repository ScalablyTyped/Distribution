package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreWindowResizeManager extends StObject {
  
  def notifyLayoutCompleted(): Unit
}
object ICoreWindowResizeManager {
  
  inline def apply(notifyLayoutCompleted: () => Unit): ICoreWindowResizeManager = {
    val __obj = js.Dynamic.literal(notifyLayoutCompleted = js.Any.fromFunction0(notifyLayoutCompleted))
    __obj.asInstanceOf[ICoreWindowResizeManager]
  }
  
  extension [Self <: ICoreWindowResizeManager](x: Self) {
    
    inline def setNotifyLayoutCompleted(value: () => Unit): Self = StObject.set(x, "notifyLayoutCompleted", js.Any.fromFunction0(value))
  }
}
