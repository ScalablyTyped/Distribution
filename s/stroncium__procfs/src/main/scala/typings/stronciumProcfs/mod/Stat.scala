package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stat extends StObject {
  
  var bootTime: js.Date
  
  var contextSwitches: Double
  
  var cpuTime: js.Array[StatCpuTime]
  
  var forks: Double
  
  var interrupts: Double
  
  var numberedInterrupts: js.Array[Double]
  
  var numberedSoftInterrupts: js.Array[Double]
  
  var processesBlocked: Double
  
  var processesRunning: Double
  
  var softInterrupts: Double
  
  var systemCpuTime: StatCpuTime
}
object Stat {
  
  inline def apply(
    bootTime: js.Date,
    contextSwitches: Double,
    cpuTime: js.Array[StatCpuTime],
    forks: Double,
    interrupts: Double,
    numberedInterrupts: js.Array[Double],
    numberedSoftInterrupts: js.Array[Double],
    processesBlocked: Double,
    processesRunning: Double,
    softInterrupts: Double,
    systemCpuTime: StatCpuTime
  ): Stat = {
    val __obj = js.Dynamic.literal(bootTime = bootTime.asInstanceOf[js.Any], contextSwitches = contextSwitches.asInstanceOf[js.Any], cpuTime = cpuTime.asInstanceOf[js.Any], forks = forks.asInstanceOf[js.Any], interrupts = interrupts.asInstanceOf[js.Any], numberedInterrupts = numberedInterrupts.asInstanceOf[js.Any], numberedSoftInterrupts = numberedSoftInterrupts.asInstanceOf[js.Any], processesBlocked = processesBlocked.asInstanceOf[js.Any], processesRunning = processesRunning.asInstanceOf[js.Any], softInterrupts = softInterrupts.asInstanceOf[js.Any], systemCpuTime = systemCpuTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
  
  extension [Self <: Stat](x: Self) {
    
    inline def setBootTime(value: js.Date): Self = StObject.set(x, "bootTime", value.asInstanceOf[js.Any])
    
    inline def setContextSwitches(value: Double): Self = StObject.set(x, "contextSwitches", value.asInstanceOf[js.Any])
    
    inline def setCpuTime(value: js.Array[StatCpuTime]): Self = StObject.set(x, "cpuTime", value.asInstanceOf[js.Any])
    
    inline def setCpuTimeVarargs(value: StatCpuTime*): Self = StObject.set(x, "cpuTime", js.Array(value*))
    
    inline def setForks(value: Double): Self = StObject.set(x, "forks", value.asInstanceOf[js.Any])
    
    inline def setInterrupts(value: Double): Self = StObject.set(x, "interrupts", value.asInstanceOf[js.Any])
    
    inline def setNumberedInterrupts(value: js.Array[Double]): Self = StObject.set(x, "numberedInterrupts", value.asInstanceOf[js.Any])
    
    inline def setNumberedInterruptsVarargs(value: Double*): Self = StObject.set(x, "numberedInterrupts", js.Array(value*))
    
    inline def setNumberedSoftInterrupts(value: js.Array[Double]): Self = StObject.set(x, "numberedSoftInterrupts", value.asInstanceOf[js.Any])
    
    inline def setNumberedSoftInterruptsVarargs(value: Double*): Self = StObject.set(x, "numberedSoftInterrupts", js.Array(value*))
    
    inline def setProcessesBlocked(value: Double): Self = StObject.set(x, "processesBlocked", value.asInstanceOf[js.Any])
    
    inline def setProcessesRunning(value: Double): Self = StObject.set(x, "processesRunning", value.asInstanceOf[js.Any])
    
    inline def setSoftInterrupts(value: Double): Self = StObject.set(x, "softInterrupts", value.asInstanceOf[js.Any])
    
    inline def setSystemCpuTime(value: StatCpuTime): Self = StObject.set(x, "systemCpuTime", value.asInstanceOf[js.Any])
  }
}
