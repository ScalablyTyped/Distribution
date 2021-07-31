package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.BoundedBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchControlParameters extends StObject {
  
  var data: js.UndefOr[js.Object] = js.undefined
  
  var options: js.UndefOr[BoundedBy] = js.undefined
  
  var state: js.UndefOr[js.Object] = js.undefined
}
object ISearchControlParameters {
  
  @scala.inline
  def apply(): ISearchControlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISearchControlParameters]
  }
  
  @scala.inline
  implicit class ISearchControlParametersMutableBuilder[Self <: ISearchControlParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setOptions(value: BoundedBy): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setState(value: js.Object): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
