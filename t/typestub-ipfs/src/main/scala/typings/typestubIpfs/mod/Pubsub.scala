package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pubsub extends StObject {
  
  def ls(): js.Promise[js.Any] = js.native
  def ls(callback: Callback[js.Any]): Unit = js.native
  
  def peers(topic: js.Any): js.Promise[js.Any] = js.native
  def peers(topic: js.Any, callback: Callback[js.Any]): Unit = js.native
  
  def publish(topic: js.Any, data: js.Any): js.Promise[js.Any] = js.native
  def publish(topic: js.Any, data: js.Any, callback: Callback[js.Any]): Unit = js.native
  
  def setMaxListeners(n: Double): js.Any = js.native
  
  def subscribe(topic: js.Any, handler: js.Any, options: js.Any): js.Promise[Unit] = js.native
  def subscribe(topic: js.Any, handler: js.Any, options: js.Any, callback: Callback[js.Any]): Unit = js.native
  
  def unsubscribe(topic: js.Any, handler: js.Any): js.Promise[Unit] = js.native
  def unsubscribe(topic: js.Any, handler: js.Any, callback: Callback[Unit]): Unit = js.native
}
