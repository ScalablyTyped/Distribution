package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terser", "Dictionary")
@js.native
class Dictionary () extends js.Object {
  def add(key: java.lang.String, `val`: js.Any): this.type = js.native
  def del(key: java.lang.String): this.type = js.native
  def each(fn: DictEachCallback): scala.Unit = js.native
  def get(key: java.lang.String): js.Any = js.native
  def has(key: java.lang.String): scala.Boolean = js.native
  def map(fn: DictEachCallback): js.Array[_] = js.native
  def set(key: java.lang.String, `val`: js.Any): this.type = js.native
  def size(): scala.Double = js.native
}

/* static members */
@JSImport("terser", "Dictionary")
@js.native
object Dictionary extends js.Object {
  def fromObject(obj: js.Object): terserLib.terserMod.Dictionary = js.native
}

