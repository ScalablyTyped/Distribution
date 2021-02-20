package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.AdjustMapMargin
import typings.yandexMaps.anon.Expanded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouteButtonParameters extends StObject {
  
  var options: js.UndefOr[AdjustMapMargin] = js.native
  
  var state: js.UndefOr[Expanded] = js.native
}
object IRouteButtonParameters {
  
  @scala.inline
  def apply(): IRouteButtonParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRouteButtonParameters]
  }
  
  @scala.inline
  implicit class IRouteButtonParametersMutableBuilder[Self <: IRouteButtonParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: AdjustMapMargin): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setState(value: Expanded): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
