package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisksIoData extends StObject {
  
  var ms: Double
  
  var rIO: Double
  
  var rIO_sec: Double | Null
  
  var rWaitPercent: Double | Null
  
  var rWaitTime: Double
  
  var tIO: Double
  
  var tIO_sec: Double | Null
  
  var tWaitPercent: Double | Null
  
  var tWaitTime: Double
  
  var wIO: Double
  
  var wIO_sec: Double | Null
  
  var wWaitPercent: Double | Null
  
  var wWaitTime: Double
}
object DisksIoData {
  
  inline def apply(
    ms: Double,
    rIO: Double,
    rWaitTime: Double,
    tIO: Double,
    tWaitTime: Double,
    wIO: Double,
    wWaitTime: Double
  ): DisksIoData = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any], rIO = rIO.asInstanceOf[js.Any], rWaitTime = rWaitTime.asInstanceOf[js.Any], tIO = tIO.asInstanceOf[js.Any], tWaitTime = tWaitTime.asInstanceOf[js.Any], wIO = wIO.asInstanceOf[js.Any], wWaitTime = wWaitTime.asInstanceOf[js.Any], rIO_sec = null, rWaitPercent = null, tIO_sec = null, tWaitPercent = null, wIO_sec = null, wWaitPercent = null)
    __obj.asInstanceOf[DisksIoData]
  }
  
  extension [Self <: DisksIoData](x: Self) {
    
    inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
    
    inline def setRIO(value: Double): Self = StObject.set(x, "rIO", value.asInstanceOf[js.Any])
    
    inline def setRIO_sec(value: Double): Self = StObject.set(x, "rIO_sec", value.asInstanceOf[js.Any])
    
    inline def setRIO_secNull: Self = StObject.set(x, "rIO_sec", null)
    
    inline def setRWaitPercent(value: Double): Self = StObject.set(x, "rWaitPercent", value.asInstanceOf[js.Any])
    
    inline def setRWaitPercentNull: Self = StObject.set(x, "rWaitPercent", null)
    
    inline def setRWaitTime(value: Double): Self = StObject.set(x, "rWaitTime", value.asInstanceOf[js.Any])
    
    inline def setTIO(value: Double): Self = StObject.set(x, "tIO", value.asInstanceOf[js.Any])
    
    inline def setTIO_sec(value: Double): Self = StObject.set(x, "tIO_sec", value.asInstanceOf[js.Any])
    
    inline def setTIO_secNull: Self = StObject.set(x, "tIO_sec", null)
    
    inline def setTWaitPercent(value: Double): Self = StObject.set(x, "tWaitPercent", value.asInstanceOf[js.Any])
    
    inline def setTWaitPercentNull: Self = StObject.set(x, "tWaitPercent", null)
    
    inline def setTWaitTime(value: Double): Self = StObject.set(x, "tWaitTime", value.asInstanceOf[js.Any])
    
    inline def setWIO(value: Double): Self = StObject.set(x, "wIO", value.asInstanceOf[js.Any])
    
    inline def setWIO_sec(value: Double): Self = StObject.set(x, "wIO_sec", value.asInstanceOf[js.Any])
    
    inline def setWIO_secNull: Self = StObject.set(x, "wIO_sec", null)
    
    inline def setWWaitPercent(value: Double): Self = StObject.set(x, "wWaitPercent", value.asInstanceOf[js.Any])
    
    inline def setWWaitPercentNull: Self = StObject.set(x, "wWaitPercent", null)
    
    inline def setWWaitTime(value: Double): Self = StObject.set(x, "wWaitTime", value.asInstanceOf[js.Any])
  }
}
