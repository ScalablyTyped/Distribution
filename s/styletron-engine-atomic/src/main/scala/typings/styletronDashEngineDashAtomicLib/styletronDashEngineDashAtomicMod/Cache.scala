package typings
package styletronDashEngineDashAtomicLib.styletronDashEngineDashAtomicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styletron-engine-atomic", "Cache")
@js.native
class Cache[T] protected () extends js.Object {
  def this(idGenerator: SequentialIDGenerator, onNewValue: js.Function3[/* cache */ Cache[T], /* id */ java.lang.String, /* value */ js.Any, _]) = this()
  var cache: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var idGenerator: SequentialIDGenerator = js.native
  var key: java.lang.String = js.native
  def addValue(key: java.lang.String, value: T): scala.Double = js.native
  def onNewValue(cache: Cache[T], id: java.lang.String, value: js.Any): js.Any = js.native
}

