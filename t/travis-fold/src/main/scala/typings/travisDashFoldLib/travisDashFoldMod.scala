package typings
package travisDashFoldLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("travis-fold", JSImport.Namespace)
@js.native
object travisDashFoldMod extends js.Object {
  def end(group: java.lang.String): java.lang.String = js.native
  def isTravis(): scala.Boolean = js.native
  def pushEnd(ret: js.Array[java.lang.String], group: java.lang.String): scala.Unit = js.native
  def pushStart(ret: js.Array[java.lang.String], group: java.lang.String): scala.Unit = js.native
  def start(group: java.lang.String): java.lang.String = js.native
  def wrap(group: java.lang.String, content: java.lang.String): java.lang.String = js.native
}

