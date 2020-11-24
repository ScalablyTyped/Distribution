package typings.styletronEngineAtomic.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("styletron-engine-atomic", "MultiCache")
@js.native
class MultiCache[T] protected () extends js.Object {
  def this(idGenerator: SequentialIDGenerator, onNewCache: js.Function0[_], onNewValue: js.Function0[_]) = this()
  
  var caches: StringDictionary[Cache[T]] = js.native
  
  def getCache(key: String): Cache[T] = js.native
  
  def getSortedCacheKeys(): js.Array[String] = js.native
  
  var idGenerator: SequentialIDGenerator = js.native
  
  def onNewCache(key: String, cache: Cache[T], insertAtIndex: Double): js.Any = js.native
  
  def onNewValue(cache: Cache[T], id: String, value: T): js.Any = js.native
  
  var sortedCacheKeys: js.Array[String] = js.native
}
