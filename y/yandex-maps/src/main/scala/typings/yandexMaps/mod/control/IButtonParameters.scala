package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Content
import typings.yandexMaps.anon.Enabled
import typings.yandexMaps.anon.IBaseButtonParametersOpti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IButtonParameters extends StObject {
  
  var data: js.UndefOr[Content] = js.native
  
  var options: js.UndefOr[IBaseButtonParametersOpti] = js.native
  
  var state: js.UndefOr[Enabled] = js.native
}
object IButtonParameters {
  
  @scala.inline
  def apply(): IButtonParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonParameters]
  }
  
  @scala.inline
  implicit class IButtonParametersMutableBuilder[Self <: IButtonParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Content): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setOptions(value: IBaseButtonParametersOpti): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setState(value: Enabled): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
