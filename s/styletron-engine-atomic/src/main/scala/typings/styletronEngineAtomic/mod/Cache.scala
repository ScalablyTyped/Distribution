package typings.styletronEngineAtomic.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styletron-engine-atomic", "Cache")
@js.native
class Cache[T] protected () extends js.Object {
  def this(
    idGenerator: SequentialIDGenerator,
    onNewValue: js.Function3[/* cache */ Cache[T], /* id */ String, /* value */ js.Any, _]
  ) = this()
  var cache: StringDictionary[String] = js.native
  var idGenerator: SequentialIDGenerator = js.native
  var key: String = js.native
  def addValue(key: String, value: T): Double = js.native
  def onNewValue(cache: Cache[T], id: String, value: js.Any): js.Any = js.native
}

