package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisksIoData extends StObject {
  
  var ms: Double = js.native
  
  var rIO: Double = js.native
  
  var rIO_sec: Double = js.native
  
  var tIO: Double = js.native
  
  var tIO_sec: Double = js.native
  
  var wIO: Double = js.native
  
  var wIO_sec: Double = js.native
}
object DisksIoData {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class DisksIoDataMutableBuilder[Self <: DisksIoData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIO(value: Double): Self = StObject.set(x, "rIO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIO_sec(value: Double): Self = StObject.set(x, "rIO_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTIO(value: Double): Self = StObject.set(x, "tIO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTIO_sec(value: Double): Self = StObject.set(x, "tIO_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIO(value: Double): Self = StObject.set(x, "wIO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIO_sec(value: Double): Self = StObject.set(x, "wIO_sec", value.asInstanceOf[js.Any])
  }
}
