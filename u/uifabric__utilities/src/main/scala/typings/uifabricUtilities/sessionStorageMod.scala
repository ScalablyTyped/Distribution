package typings.uifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/sessionStorage", JSImport.Namespace)
@js.native
object sessionStorageMod extends js.Object {
  def getItem(key: String): String | Null = js.native
  def setItem(key: String, data: String): Unit = js.native
}

