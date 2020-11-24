package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeolocationControlParameters extends IButtonParameters {
  
  @JSName("data")
  var data_IGeolocationControlParameters: js.UndefOr[Image] = js.native
  
  @JSName("options")
  var options_IGeolocationControlParameters: js.UndefOr[IBaseButtonParametersOptions] = js.native
}
object IGeolocationControlParameters {
  
  @scala.inline
  def apply(): IGeolocationControlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeolocationControlParameters]
  }
  
  @scala.inline
  implicit class IGeolocationControlParametersOps[Self <: IGeolocationControlParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: Image): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setOptions(value: IBaseButtonParametersOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
