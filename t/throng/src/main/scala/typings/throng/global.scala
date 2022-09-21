package typings.throng

import typings.throng.mod.Options
import typings.throng.mod.WorkerCallback
import typings.throng.mod.WorkerCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def throng(startOrOptions: Options): js.Promise[Unit] = js.Dynamic.global.applyDynamic("throng")(startOrOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def throng(startOrOptions: WorkerCallback): js.Promise[Unit] = js.Dynamic.global.applyDynamic("throng")(startOrOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def throng(workers: WorkerCount, start: WorkerCallback): js.Promise[Unit] = (js.Dynamic.global.applyDynamic("throng")(workers.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
