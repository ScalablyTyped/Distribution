package typings.tape.tapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tape", "only")
@js.native
object only extends js.Object {
  def apply(cb: TestCase): Unit = js.native
  def apply(name: String, cb: TestCase): Unit = js.native
  def apply(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  def apply(opts: TestOptions, cb: TestCase): Unit = js.native
}

