package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pubsub extends StObject {
  
  def ls(): js.Promise[Any] = js.native
  def ls(callback: Callback[Any]): Unit = js.native
  
  def peers(topic: Any): js.Promise[Any] = js.native
  def peers(topic: Any, callback: Callback[Any]): Unit = js.native
  
  def publish(topic: Any, data: Any): js.Promise[Any] = js.native
  def publish(topic: Any, data: Any, callback: Callback[Any]): Unit = js.native
  
  def setMaxListeners(n: Double): Any = js.native
  
  def subscribe(topic: Any, handler: Any, options: Any): js.Promise[Unit] = js.native
  def subscribe(topic: Any, handler: Any, options: Any, callback: Callback[Any]): Unit = js.native
  
  def unsubscribe(topic: Any, handler: Any): js.Promise[Unit] = js.native
  def unsubscribe(topic: Any, handler: Any, callback: Callback[Unit]): Unit = js.native
}
