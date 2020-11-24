package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMapMarginOptions extends js.Object {
  
  var useMapMargin: js.UndefOr[Boolean] = js.native
}
object IMapMarginOptions {
  
  @scala.inline
  def apply(): IMapMarginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapMarginOptions]
  }
  
  @scala.inline
  implicit class IMapMarginOptionsOps[Self <: IMapMarginOptions] (val x: Self) extends AnyVal {
    
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
    def setUseMapMargin(value: Boolean): Self = this.set("useMapMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMapMargin: Self = this.set("useMapMargin", js.undefined)
  }
}
