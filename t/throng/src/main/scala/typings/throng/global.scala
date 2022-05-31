package typings.throng

import typings.throng.mod.Options
import typings.throng.mod.ProcessCallback
import typings.throng.mod.WorkerCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def throng(startOrOptions: Options): Unit = js.Dynamic.global.applyDynamic("throng")(startOrOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def throng(startOrOptions: ProcessCallback): Unit = js.Dynamic.global.applyDynamic("throng")(startOrOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def throng(workers: WorkerCount, start: ProcessCallback): Unit = (js.Dynamic.global.applyDynamic("throng")(workers.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
