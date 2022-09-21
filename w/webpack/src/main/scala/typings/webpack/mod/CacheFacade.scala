package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheFacade extends StObject {
  
  def get[T](identifier: String, etag: Null, callback: CallbackCache[T]): Unit = js.native
  def get[T](identifier: String, etag: Etag, callback: CallbackCache[T]): Unit = js.native
  
  def getChildCache(name: String): CacheFacade = js.native
  
  def getItemCache(identifier: String): ItemCacheFacade = js.native
  def getItemCache(identifier: String, etag: Etag): ItemCacheFacade = js.native
  
  def getLazyHashedEtag(obj: HashableObject): Etag = js.native
  
  def getPromise[T](identifier: String): js.Promise[T] = js.native
  def getPromise[T](identifier: String, etag: Etag): js.Promise[T] = js.native
  
  def mergeEtags(a: Etag, b: Etag): Etag = js.native
  
  def provide[T](
    identifier: String,
    etag: Null,
    computer: js.Function1[/* arg0 */ CallbackNormalErrorCache[T], Unit],
    callback: CallbackNormalErrorCache[T]
  ): Unit = js.native
  def provide[T](
    identifier: String,
    etag: Etag,
    computer: js.Function1[/* arg0 */ CallbackNormalErrorCache[T], Unit],
    callback: CallbackNormalErrorCache[T]
  ): Unit = js.native
  
  def providePromise[T](identifier: String, etag: Null, computer: js.Function0[T | js.Promise[T]]): js.Promise[T] = js.native
  def providePromise[T](identifier: String, etag: Etag, computer: js.Function0[T | js.Promise[T]]): js.Promise[T] = js.native
  
  def store[T](identifier: String, etag: Null, data: T, callback: CallbackCache[Unit]): Unit = js.native
  def store[T](identifier: String, etag: Etag, data: T, callback: CallbackCache[Unit]): Unit = js.native
  
  def storePromise[T](identifier: String, etag: Null, data: T): js.Promise[Unit] = js.native
  def storePromise[T](identifier: String, etag: Etag, data: T): js.Promise[Unit] = js.native
}
