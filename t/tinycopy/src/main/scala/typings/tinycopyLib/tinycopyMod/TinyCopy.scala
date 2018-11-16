package typings
package tinycopyLib.tinycopyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinyCopy extends js.Object {
  def on(
    `type`: java.lang.String,
    action: js.Function1[/* e */ java.lang.String | stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    `type`: tinycopyLib.tinycopyLibStrings.error,
    action: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_success(
    `type`: tinycopyLib.tinycopyLibStrings.success,
    action: js.Function1[/* data */ java.lang.String, scala.Unit]
  ): this.type = js.native
}

