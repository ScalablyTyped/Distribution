package typings.tokgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenGenerator extends js.Object {
  def generate(): String = js.native
  def generate(callback: Callback): Unit = js.native
  def generate(length: Double): String = js.native
  def generate(length: Double, callback: Callback): Unit = js.native
}

