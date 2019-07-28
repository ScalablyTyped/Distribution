package typings.tapeDashAsync

import typings.tapeDashAsync.tapeDashAsyncMod.TestCase
import typings.tapeDashAsync.tapeDashAsyncMod.TestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Cb extends js.Object {
  def apply(cb: TestCase): Unit = js.native
  def apply(name: String, cb: TestCase): Unit = js.native
  def apply(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  def apply(name: TestOptions, cb: TestCase): Unit = js.native
}

