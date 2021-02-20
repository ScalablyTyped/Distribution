package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
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
  implicit class GestureEventMapMutableBuilder[Self <: GestureEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrientationchange(value: GestureOrientationchangeEvent): Self = StObject.set(x, "orientationchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShake(value: GestureShakeEvent): Self = StObject.set(x, "shake", value.asInstanceOf[js.Any])
  }
}
