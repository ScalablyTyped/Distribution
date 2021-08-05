package typings.usage

import typings.std.Error
import typings.usage.anon.Rss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("usage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearHistory(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearHistory")().asInstanceOf[Unit]
  inline def clearHistory(pid: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearHistory")(pid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def lookup(pid: Double, callback: js.Function2[/* err */ Error, /* result */ ResultObject, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(pid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lookup(
    pid: Double,
    options: Options,
    callback: js.Function2[/* err */ Error, /* result */ ResultObject, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(pid.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var keepHistory: Boolean
  }
  object Options {
    
    inline def apply(keepHistory: Boolean): Options = {
      val __obj = js.Dynamic.literal(keepHistory = keepHistory.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setKeepHistory(value: Boolean): Self = StObject.set(x, "keepHistory", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResultObject extends StObject {
    
    var cpu: Double
    
    var memory: Double
    
    var memoryInfo: Rss
  }
  object ResultObject {
    
    inline def apply(cpu: Double, memory: Double, memoryInfo: Rss): ResultObject = {
      val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], memoryInfo = memoryInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultObject]
    }
    
    extension [Self <: ResultObject](x: Self) {
      
      inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryInfo(value: Rss): Self = StObject.set(x, "memoryInfo", value.asInstanceOf[js.Any])
    }
  }
}
