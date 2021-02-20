package typings.tanemSvgInjector

import typings.tanemSvgInjector.typesMod.Errback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestQueueMod {
  
  @JSImport("@tanem/svg-injector/dist/request-queue", "clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("@tanem/svg-injector/dist/request-queue", "processRequestQueue")
  @js.native
  def processRequestQueue(url: String): Unit = js.native
  
  @JSImport("@tanem/svg-injector/dist/request-queue", "queueRequest")
  @js.native
  def queueRequest(url: String, callback: Errback): Unit = js.native
}
