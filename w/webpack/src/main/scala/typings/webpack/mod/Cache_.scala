package typings.webpack.mod

import typings.webpack.anon.BeginIdle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "Cache")
@js.native
open class Cache_ () extends StObject {
  
  def beginIdle(): Unit = js.native
  
  def endIdle(callback: CallbackCache[Unit]): Unit = js.native
  
  def get[T](identifier: String, etag: Null, callback: CallbackCache[T]): Unit = js.native
  def get[T](identifier: String, etag: Etag, callback: CallbackCache[T]): Unit = js.native
  
  var hooks: BeginIdle = js.native
  
  def shutdown(callback: CallbackCache[Unit]): Unit = js.native
  
  def store[T](identifier: String, etag: Null, data: T, callback: CallbackCache[Unit]): Unit = js.native
  def store[T](identifier: String, etag: Etag, data: T, callback: CallbackCache[Unit]): Unit = js.native
  
  /**
  	 * After this method has succeeded the cache can only be restored when build dependencies are
  	 */
  def storeBuildDependencies(dependencies: js.Iterable[String], callback: CallbackCache[Unit]): Unit = js.native
}
object Cache_ {
  
  @JSImport("webpack", "Cache")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("webpack", "Cache.STAGE_DEFAULT")
  @js.native
  def STAGE_DEFAULT: Double = js.native
  inline def STAGE_DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STAGE_DEFAULT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("webpack", "Cache.STAGE_DISK")
  @js.native
  def STAGE_DISK: Double = js.native
  inline def STAGE_DISK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STAGE_DISK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("webpack", "Cache.STAGE_MEMORY")
  @js.native
  def STAGE_MEMORY: Double = js.native
  inline def STAGE_MEMORY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STAGE_MEMORY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("webpack", "Cache.STAGE_NETWORK")
  @js.native
  def STAGE_NETWORK: Double = js.native
  inline def STAGE_NETWORK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STAGE_NETWORK")(x.asInstanceOf[js.Any])
}
