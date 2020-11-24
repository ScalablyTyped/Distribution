package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IZoomControlParameters extends js.Object {
  
  var options: js.UndefOr[`1`] = js.native
}
object IZoomControlParameters {
  
  @scala.inline
  def apply(): IZoomControlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IZoomControlParameters]
  }
  
  @scala.inline
  implicit class IZoomControlParametersOps[Self <: IZoomControlParameters] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: `1`): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
