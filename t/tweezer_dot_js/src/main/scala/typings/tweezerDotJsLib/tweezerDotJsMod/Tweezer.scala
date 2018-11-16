package typings
package tweezerDotJsLib.tweezerDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tweezer extends js.Object {
  def begin(): this.type = js.native
  @JSName("on")
  def on_done(name: tweezerDotJsLib.tweezerDotJsLibStrings.done, handler: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_tick(
    name: tweezerDotJsLib.tweezerDotJsLibStrings.tick,
    handler: js.Function1[/* v */ scala.Double, scala.Unit]
  ): this.type = js.native
  def stop(): this.type = js.native
}

