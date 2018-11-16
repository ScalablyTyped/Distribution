package typings
package wreckLib.wreckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WreckEventEmitter
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("on")
  def on_request(event: wreckLib.wreckLibStrings.request, listener: wreckLib.RequestCallback): this.type = js.native
  @JSName("on")
  def on_response(event: wreckLib.wreckLibStrings.response, listener: wreckLib.ResponseCallback): this.type = js.native
}

