package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToManagerStatics extends StObject {
  
  def getForCurrentView(): PlayToManager
  
  def showPlayToUI(): Unit
}
object IPlayToManagerStatics {
  
  inline def apply(getForCurrentView: () => PlayToManager, showPlayToUI: () => Unit): IPlayToManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView), showPlayToUI = js.Any.fromFunction0(showPlayToUI))
    __obj.asInstanceOf[IPlayToManagerStatics]
  }
  
  extension [Self <: IPlayToManagerStatics](x: Self) {
    
    inline def setGetForCurrentView(value: () => PlayToManager): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
    
    inline def setShowPlayToUI(value: () => Unit): Self = StObject.set(x, "showPlayToUI", js.Any.fromFunction0(value))
  }
}
