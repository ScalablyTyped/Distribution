package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlayToManagerStatics extends StObject {
  
  def getForCurrentView(): PlayToManager = js.native
  
  def showPlayToUI(): Unit = js.native
}
object IPlayToManagerStatics {
  
  @scala.inline
  def apply(getForCurrentView: () => PlayToManager, showPlayToUI: () => Unit): IPlayToManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView), showPlayToUI = js.Any.fromFunction0(showPlayToUI))
    __obj.asInstanceOf[IPlayToManagerStatics]
  }
  
  @scala.inline
  implicit class IPlayToManagerStaticsMutableBuilder[Self <: IPlayToManagerStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetForCurrentView(value: () => PlayToManager): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowPlayToUI(value: () => Unit): Self = StObject.set(x, "showPlayToUI", js.Any.fromFunction0(value))
  }
}
