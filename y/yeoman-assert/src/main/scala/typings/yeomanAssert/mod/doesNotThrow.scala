package typings.yeomanAssert.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-assert", "doesNotThrow")
@js.native
object doesNotThrow extends js.Object {
  def apply(block: js.Function0[Unit]): Unit = js.native
  def apply(block: js.Function0[Unit], error: js.Function0[Unit]): Unit = js.native
  def apply(block: js.Function0[Unit], error: js.Function0[Unit], message: String): Unit = js.native
  def apply(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  def apply(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  def apply(block: js.Function0[Unit], error: RegExp): Unit = js.native
  def apply(block: js.Function0[Unit], error: RegExp, message: String): Unit = js.native
  def apply(block: js.Function0[Unit], message: String): Unit = js.native
}

