package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreWindowResizeManager
  extends StObject
     with ICoreWindowResizeManager
object CoreWindowResizeManager {
  
  inline def apply(notifyLayoutCompleted: () => Unit): CoreWindowResizeManager = {
    val __obj = js.Dynamic.literal(notifyLayoutCompleted = js.Any.fromFunction0(notifyLayoutCompleted))
    __obj.asInstanceOf[CoreWindowResizeManager]
  }
}
