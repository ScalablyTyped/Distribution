package typings.throng

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(startOrOptions: Options): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(startOrOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(startOrOptions: WorkerCallback): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(startOrOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(workers: WorkerCount, start: WorkerCallback): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(workers.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("throng", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type MasterCallback = js.Function0[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.throng.anon.startWorkerCallbacksignal
    - typings.throng.anon.workerWorkerCallbacksigna
  */
  trait Options extends StObject
  object Options {
    
    inline def startWorkerCallbacksignal(start: (/* id */ Double, /* disconnect */ js.Function0[Unit]) => Unit): typings.throng.anon.startWorkerCallbacksignal = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction2(start))
      __obj.asInstanceOf[typings.throng.anon.startWorkerCallbacksignal]
    }
    
    inline def workerWorkerCallbacksigna(worker: (/* id */ Double, /* disconnect */ js.Function0[Unit]) => Unit): typings.throng.anon.workerWorkerCallbacksigna = {
      val __obj = js.Dynamic.literal(worker = js.Any.fromFunction2(worker))
      __obj.asInstanceOf[typings.throng.anon.workerWorkerCallbacksigna]
    }
  }
  
  type WorkerCallback = js.Function2[/* id */ Double, /* disconnect */ js.Function0[Unit], Unit]
  
  type WorkerCount = Double | String
}
