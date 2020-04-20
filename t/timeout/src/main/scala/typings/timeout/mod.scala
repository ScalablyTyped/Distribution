package typings.timeout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timeout", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def timeout(): String = js.native
  def timeout(name: String): String = js.native
  def timeout(name: String, ms: Double): String = js.native
  def timeout(name: String, ms: Double, callback: js.Function0[Unit]): String = js.native
}

