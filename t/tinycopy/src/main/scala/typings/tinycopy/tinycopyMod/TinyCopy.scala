package typings.tinycopy.tinycopyMod

import typings.std.Error
import typings.tinycopy.tinycopyStrings.error
import typings.tinycopy.tinycopyStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinyCopy extends js.Object {
  def on(`type`: String, action: js.Function1[/* e */ String | Error, Unit]): this.type = js.native
  @JSName("on")
  def on_error(`type`: error, action: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_success(`type`: success, action: js.Function1[/* data */ String, Unit]): this.type = js.native
}

