package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deferred[T] extends StObject {
  
  /* private */ var _promise: Any = js.native
  
  /* private */ var _reject: Any = js.native
  
  /* private */ var _resolve: Any = js.native
  
  var current: T = js.native
  
  def fail(e: Any): Unit = js.native
  
  def promise: js.Promise[T] = js.native
  
  def set(value: T): Unit = js.native
  
  def update(value: T): Unit = js.native
}
