package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServicesData extends StObject {
  
  var cpu: Double
  
  var mem: Double
  
  var name: String
  
  var pids: js.Array[Double]
  
  var running: Boolean
  
  var startmode: String
}
object ServicesData {
  
  inline def apply(
    cpu: Double,
    mem: Double,
    name: String,
    pids: js.Array[Double],
    running: Boolean,
    startmode: String
  ): ServicesData = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pids = pids.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], startmode = startmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicesData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServicesData] (val x: Self) extends AnyVal {
    
    inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setMem(value: Double): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPids(value: js.Array[Double]): Self = StObject.set(x, "pids", value.asInstanceOf[js.Any])
    
    inline def setPidsVarargs(value: Double*): Self = StObject.set(x, "pids", js.Array(value*))
    
    inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def setStartmode(value: String): Self = StObject.set(x, "startmode", value.asInstanceOf[js.Any])
  }
}
