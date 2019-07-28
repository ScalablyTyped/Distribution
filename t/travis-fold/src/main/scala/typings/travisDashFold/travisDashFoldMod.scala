package typings.travisDashFold

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("travis-fold", JSImport.Namespace)
@js.native
object travisDashFoldMod extends js.Object {
  def end(group: String): String = js.native
  def isTravis(): Boolean = js.native
  def pushEnd(ret: js.Array[String], group: String): Unit = js.native
  def pushStart(ret: js.Array[String], group: String): Unit = js.native
  def start(group: String): String = js.native
  def wrap(group: String, content: String): String = js.native
}

