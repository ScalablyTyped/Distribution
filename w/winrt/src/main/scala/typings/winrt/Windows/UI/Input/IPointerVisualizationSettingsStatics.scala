package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPointerVisualizationSettingsStatics extends StObject {
  
  def getForCurrentView(): PointerVisualizationSettings = js.native
}
object IPointerVisualizationSettingsStatics {
  
  @scala.inline
  def apply(getForCurrentView: () => PointerVisualizationSettings): IPointerVisualizationSettingsStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
    __obj.asInstanceOf[IPointerVisualizationSettingsStatics]
  }
  
  @scala.inline
  implicit class IPointerVisualizationSettingsStaticsMutableBuilder[Self <: IPointerVisualizationSettingsStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetForCurrentView(value: () => PointerVisualizationSettings): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
  }
}
