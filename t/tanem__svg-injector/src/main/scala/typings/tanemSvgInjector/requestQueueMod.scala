package typings.tanemSvgInjector

import typings.tanemSvgInjector.typesMod.Errback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestQueueMod {
  
  @JSImport("@tanem/svg-injector/dist/request-queue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def processRequestQueue(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("processRequestQueue")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def queueRequest(url: String, callback: Errback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("queueRequest")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
