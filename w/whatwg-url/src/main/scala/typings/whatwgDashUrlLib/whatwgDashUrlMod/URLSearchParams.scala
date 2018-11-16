package typings
package whatwgDashUrlLib.whatwgDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-url", "URLSearchParams")
@js.native
class URLSearchParams protected () extends js.Object {
  def this(init: ScalablyTyped.runtime.StringDictionary[java.lang.String]) = this()
  def this(init: java.lang.String) = this()
  def this(init: js.Array[js.Tuple2[java.lang.String, java.lang.String]]) = this()
  def this(init: nodeLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]]) = this()
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator: js.Function0[nodeLib.IterableIterator[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
  def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def delete(name: java.lang.String): scala.Unit = js.native
  def get(name: java.lang.String): java.lang.String | scala.Null = js.native
  def getAll(name: java.lang.String): js.Array[java.lang.String] = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def sort(): scala.Unit = js.native
}

