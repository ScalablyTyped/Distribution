package typings.wordpressHashNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wordpress-hash-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def CheckPassword(password: String, hash: String): Boolean = js.native
  def HashPassword(password: String): String = js.native
}

