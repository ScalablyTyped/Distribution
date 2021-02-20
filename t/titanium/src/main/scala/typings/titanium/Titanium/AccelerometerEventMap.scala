package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccelerometerEventMap extends ProxyEventMap {
  
  var update: AccelerometerUpdateEvent = js.native
}
object AccelerometerEventMap {
  
  @scala.inline
  def apply(update: AccelerometerUpdateEvent): AccelerometerEventMap = {
    val __obj = js.Dynamic.literal(update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerEventMap]
  }
  
  @scala.inline
  implicit class AccelerometerEventMapMutableBuilder[Self <: AccelerometerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdate(value: AccelerometerUpdateEvent): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
