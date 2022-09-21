package typings.webpack.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "ExternalModule")
@js.native
open class ExternalModule () extends Module {
  def this(request: Any) = this()
  def this(request: Any, `type`: Any) = this()
  def this(request: Unit, `type`: Any) = this()
  def this(request: Any, `type`: Any, userRequest: Any) = this()
  def this(request: Any, `type`: Unit, userRequest: Any) = this()
  def this(request: Unit, `type`: Any, userRequest: Any) = this()
  def this(request: Unit, `type`: Unit, userRequest: Any) = this()
  
  var externalType: String = js.native
  
  var request: String | js.Array[String] | (Record[String, String | js.Array[String]]) = js.native
  
  def restoreFromUnsafeCache(): Unit = js.native
  def restoreFromUnsafeCache(unsafeCacheData: Any): Unit = js.native
  def restoreFromUnsafeCache(unsafeCacheData: Any, normalModuleFactory: Any): Unit = js.native
  def restoreFromUnsafeCache(unsafeCacheData: Unit, normalModuleFactory: Any): Unit = js.native
  
  var userRequest: String = js.native
}
