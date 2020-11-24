package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureEventMap extends ProxyEventMap {
  
  var orientationchange: GestureOrientationchangeEvent = js.native
  
  var shake: GestureShakeEvent = js.native
}
object GestureEventMap {
  
  @scala.inline
  def apply(orientationchange: GestureOrientationchangeEvent, shake: GestureShakeEvent): GestureEventMap = {
    val __obj = js.Dynamic.literal(orientationchange = orientationchange.asInstanceOf[js.Any], shake = shake.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureEventMap]
  }
  
  @scala.inline
  implicit class GestureEventMapOps[Self <: GestureEventMap] (val x: Self) extends AnyVal {
    
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
    def setOrientationchange(value: GestureOrientationchangeEvent): Self = this.set("orientationchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShake(value: GestureShakeEvent): Self = this.set("shake", value.asInstanceOf[js.Any])
  }
}
