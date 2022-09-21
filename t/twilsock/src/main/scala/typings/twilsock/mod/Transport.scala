package typings.twilsock.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transport extends EventEmitter {
  
  def delete[T](url: String, headers: Headers): js.Promise[Result[T]] = js.native
  def delete[T](url: String, headers: Headers, body: Unit, grant: String): js.Promise[Result[T]] = js.native
  def delete[T](url: String, headers: Headers, body: Context[Record[String, Any]]): js.Promise[Result[T]] = js.native
  def delete[T](url: String, headers: Headers, body: Context[Record[String, Any]], grant: String): js.Promise[Result[T]] = js.native
  
  def get[T](url: String, headers: Headers): js.Promise[Result[T]] = js.native
  def get[T](url: String, headers: Headers, grant: String): js.Promise[Result[T]] = js.native
  
  val isConnected: Boolean = js.native
  
  def post[T](url: String, headers: Headers, body: String): js.Promise[Result[T]] = js.native
  def post[T](url: String, headers: Headers, body: String, grant: String): js.Promise[Result[T]] = js.native
  def post[T](url: String, headers: Headers, body: Context[Record[String, Any]]): js.Promise[Result[T]] = js.native
  def post[T](url: String, headers: Headers, body: Context[Record[String, Any]], grant: String): js.Promise[Result[T]] = js.native
  
  def put[T](url: String, headers: Headers, body: Context[Record[String, Any]]): js.Promise[Result[T]] = js.native
  def put[T](url: String, headers: Headers, body: Context[Record[String, Any]], grant: String): js.Promise[Result[T]] = js.native
  
  val state: String = js.native
}
