package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Bottom
import typings.yandexMaps.yandexMapsStrings.left
import typings.yandexMaps.yandexMapsStrings.none
import typings.yandexMaps.yandexMapsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IManagerControlOptions extends js.Object {
  
  var float: js.UndefOr[none | left | right] = js.native
  
  var floatIndex: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[Bottom] = js.native
}
object IManagerControlOptions {
  
  @scala.inline
  def apply(): IManagerControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IManagerControlOptions]
  }
  
  @scala.inline
  implicit class IManagerControlOptionsOps[Self <: IManagerControlOptions] (val x: Self) extends AnyVal {
    
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
    def setFloat(value: none | left | right): Self = this.set("float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    
    @scala.inline
    def setFloatIndex(value: Double): Self = this.set("floatIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatIndex: Self = this.set("floatIndex", js.undefined)
    
    @scala.inline
    def setPosition(value: Bottom): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
