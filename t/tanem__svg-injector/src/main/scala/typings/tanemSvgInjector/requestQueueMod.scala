package typings.tanemSvgInjector

import typings.tanemSvgInjector.typesMod.Errback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tanem/svg-injector/dist/request-queue", JSImport.Namespace)
@js.native
object requestQueueMod extends js.Object {
  
  def clear(): Unit = js.native
  
  def processRequestQueue(url: String): Unit = js.native
  
  def queueRequest(url: String, callback: Errback): Unit = js.native
}
