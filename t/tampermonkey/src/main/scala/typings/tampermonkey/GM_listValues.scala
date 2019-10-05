package typings.tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_listValues")
@js.native
object GM_listValues extends js.Object {
  /** Lists all names of the storage */
  def apply(): js.Array[String] = js.native
}

