package typings.throng

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(startOrOptions: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(startOrOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(startOrOptions: ProcessCallback): Unit = ^.asInstanceOf[js.Dynamic].apply(startOrOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(workers: WorkerCount, start: ProcessCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(workers.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("throng", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var grace: js.UndefOr[Double] = js.undefined
    
    var lifetime: js.UndefOr[Double] = js.undefined
    
    var master: js.UndefOr[ProcessCallback] = js.undefined
    
    def start(id: Double): js.Any
    @JSName("start")
    var start_Original: ProcessCallback
    
    var workers: js.UndefOr[WorkerCount] = js.undefined
  }
  object Options {
    
    inline def apply(start: /* id */ Double => js.Any): Options = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction1(start))
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGrace(value: Double): Self = StObject.set(x, "grace", value.asInstanceOf[js.Any])
      
      inline def setGraceUndefined: Self = StObject.set(x, "grace", js.undefined)
      
      inline def setLifetime(value: Double): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
      
      inline def setMaster(value: /* id */ Double => js.Any): Self = StObject.set(x, "master", js.Any.fromFunction1(value))
      
      inline def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
      
      inline def setStart(value: /* id */ Double => js.Any): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setWorkers(value: WorkerCount): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
  
  type ProcessCallback = js.Function1[/* id */ Double, js.Any]
  
  type WorkerCount = Double | String
}
