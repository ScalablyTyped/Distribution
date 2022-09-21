package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VimeoCameraProps extends StObject {
  
  var fov: Double
  
  var pitch: Double
  
  var roll: Double
  
  var yaw: Double
}
object VimeoCameraProps {
  
  inline def apply(fov: Double, pitch: Double, roll: Double, yaw: Double): VimeoCameraProps = {
    val __obj = js.Dynamic.literal(fov = fov.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], yaw = yaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[VimeoCameraProps]
  }
  
  extension [Self <: VimeoCameraProps](x: Self) {
    
    inline def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
    
    inline def setYaw(value: Double): Self = StObject.set(x, "yaw", value.asInstanceOf[js.Any])
  }
}
