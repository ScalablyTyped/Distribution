package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Cache")
@js.native
object CacheNs extends js.Object {
  var enabled: Boolean = js.native
  var files: js.Any = js.native
  def add(key: String, file: js.Any): Unit = js.native
  def clear(): Unit = js.native
  def get(key: String): js.Any = js.native
  def remove(key: String): Unit = js.native
}

