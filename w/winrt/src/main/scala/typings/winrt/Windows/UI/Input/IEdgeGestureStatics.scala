package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEdgeGestureStatics extends StObject {
  
  def getForCurrentView(): EdgeGesture
}
object IEdgeGestureStatics {
  
  @scala.inline
  def apply(getForCurrentView: () => EdgeGesture): IEdgeGestureStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
    __obj.asInstanceOf[IEdgeGestureStatics]
  }
  
  @scala.inline
  implicit class IEdgeGestureStaticsMutableBuilder[Self <: IEdgeGestureStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetForCurrentView(value: () => EdgeGesture): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
  }
}
