package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Layout
import typings.yandexMaps.anon.Selected
import typings.yandexMaps.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IListBoxItemParameters extends StObject {
  
  var data: js.UndefOr[`0`] = js.undefined
  
  var options: js.UndefOr[Layout] = js.undefined
  
  var state: js.UndefOr[Selected] = js.undefined
}
object IListBoxItemParameters {
  
  @scala.inline
  def apply(): IListBoxItemParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListBoxItemParameters]
  }
  
  @scala.inline
  implicit class IListBoxItemParametersMutableBuilder[Self <: IListBoxItemParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: `0`): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setOptions(value: Layout): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setState(value: Selected): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
