package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPointerVisualizationSettingsStatics extends StObject {
  
  def getForCurrentView(): PointerVisualizationSettings
}
object IPointerVisualizationSettingsStatics {
  
  inline def apply(getForCurrentView: () => PointerVisualizationSettings): IPointerVisualizationSettingsStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
    __obj.asInstanceOf[IPointerVisualizationSettingsStatics]
  }
  
  extension [Self <: IPointerVisualizationSettingsStatics](x: Self) {
    
    inline def setGetForCurrentView(value: () => PointerVisualizationSettings): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
  }
}
