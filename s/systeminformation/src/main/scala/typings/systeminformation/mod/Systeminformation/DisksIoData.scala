package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisksIoData extends StObject {
  
  var ms: Double
  
  var rIO: Double
  
  var rIO_sec: Double
  
  var tIO: Double
  
  var tIO_sec: Double
  
  var wIO: Double
  
  var wIO_sec: Double
}
object DisksIoData {
  
  inline def apply(
    ms: Double,
    rIO: Double,
    rIO_sec: Double,
    tIO: Double,
    tIO_sec: Double,
    wIO: Double,
    wIO_sec: Double
  ): DisksIoData = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any], rIO = rIO.asInstanceOf[js.Any], rIO_sec = rIO_sec.asInstanceOf[js.Any], tIO = tIO.asInstanceOf[js.Any], tIO_sec = tIO_sec.asInstanceOf[js.Any], wIO = wIO.asInstanceOf[js.Any], wIO_sec = wIO_sec.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisksIoData]
  }
  
  extension [Self <: DisksIoData](x: Self) {
    
    inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
    
    inline def setRIO(value: Double): Self = StObject.set(x, "rIO", value.asInstanceOf[js.Any])
    
    inline def setRIO_sec(value: Double): Self = StObject.set(x, "rIO_sec", value.asInstanceOf[js.Any])
    
    inline def setTIO(value: Double): Self = StObject.set(x, "tIO", value.asInstanceOf[js.Any])
    
    inline def setTIO_sec(value: Double): Self = StObject.set(x, "tIO_sec", value.asInstanceOf[js.Any])
    
    inline def setWIO(value: Double): Self = StObject.set(x, "wIO", value.asInstanceOf[js.Any])
    
    inline def setWIO_sec(value: Double): Self = StObject.set(x, "wIO_sec", value.asInstanceOf[js.Any])
  }
}
