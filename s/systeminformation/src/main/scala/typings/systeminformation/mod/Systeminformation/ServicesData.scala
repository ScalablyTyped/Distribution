package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServicesData extends StObject {
  
  var name: String
  
  var pcpu: Double
  
  var pids: js.Array[Double]
  
  var pmem: Double
  
  var running: Boolean
  
  var startmode: String
}
object ServicesData {
  
  @scala.inline
  def apply(
    name: String,
    pcpu: Double,
    pids: js.Array[Double],
    pmem: Double,
    running: Boolean,
    startmode: String
  ): ServicesData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pcpu = pcpu.asInstanceOf[js.Any], pids = pids.asInstanceOf[js.Any], pmem = pmem.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], startmode = startmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicesData]
  }
  
  @scala.inline
  implicit class ServicesDataMutableBuilder[Self <: ServicesData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcpu(value: Double): Self = StObject.set(x, "pcpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPids(value: js.Array[Double]): Self = StObject.set(x, "pids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPidsVarargs(value: Double*): Self = StObject.set(x, "pids", js.Array(value :_*))
    
    @scala.inline
    def setPmem(value: Double): Self = StObject.set(x, "pmem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartmode(value: String): Self = StObject.set(x, "startmode", value.asInstanceOf[js.Any])
  }
}
