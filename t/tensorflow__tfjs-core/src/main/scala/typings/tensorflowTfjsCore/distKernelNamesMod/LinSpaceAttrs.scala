package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinSpaceAttrs extends StObject {
  
  var num: Double
  
  var start: Double
  
  var stop: Double
}
object LinSpaceAttrs {
  
  inline def apply(num: Double, start: Double, stop: Double): LinSpaceAttrs = {
    val __obj = js.Dynamic.literal(num = num.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinSpaceAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinSpaceAttrs] (val x: Self) extends AnyVal {
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
