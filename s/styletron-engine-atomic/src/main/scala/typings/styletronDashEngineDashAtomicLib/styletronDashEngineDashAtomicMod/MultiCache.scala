package typings
package styletronDashEngineDashAtomicLib.styletronDashEngineDashAtomicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styletron-engine-atomic", "MultiCache")
@js.native
class MultiCache[T] protected () extends js.Object {
  def this(idGenerator: SequentialIDGenerator, onNewCache: js.Function0[_], onNewValue: js.Function0[_]) = this()
  var caches: org.scalablytyped.runtime.StringDictionary[Cache[T]] = js.native
  var idGenerator: SequentialIDGenerator = js.native
  var sortedCacheKeys: js.Array[java.lang.String] = js.native
  def getCache(key: java.lang.String): Cache[T] = js.native
  def getSortedCacheKeys(): js.Array[java.lang.String] = js.native
  def onNewCache(key: java.lang.String, cache: Cache[T], insertAtIndex: scala.Double): js.Any = js.native
  def onNewValue(cache: Cache[T], id: java.lang.String, value: T): js.Any = js.native
}

