package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Headers")
@js.native
class Headers () extends js.Object {
  def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def delete(name: java.lang.String): scala.Unit = js.native
  def forEach(callback: js.Function2[/* value */ java.lang.String, /* name */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def get(name: java.lang.String): java.lang.String = js.native
  def getAll(name: java.lang.String): js.Array[java.lang.String] = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

