package typings.tap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mocha extends js.Object {
  def describe(): Unit = js.native
  def describe(name: String): Unit = js.native
  def describe(name: String, fn: js.Function1[/* a */ js.Any, _]): Unit = js.native
  def global(): Unit = js.native
  def it(): Unit = js.native
  def it(name: String): Unit = js.native
  def it(name: String, fn: js.Function1[/* a */ js.Any, _]): Unit = js.native
}

