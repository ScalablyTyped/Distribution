package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.IBaseButtonParametersOptiFloat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IListBoxParameters extends IButtonParameters {
  
  @JSName("options")
  var options_IListBoxParameters: js.UndefOr[IBaseButtonParametersOptiFloat] = js.native
}
object IListBoxParameters {
  
  @scala.inline
  def apply(): IListBoxParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListBoxParameters]
  }
  
  @scala.inline
  implicit class IListBoxParametersMutableBuilder[Self <: IListBoxParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: IBaseButtonParametersOptiFloat): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
