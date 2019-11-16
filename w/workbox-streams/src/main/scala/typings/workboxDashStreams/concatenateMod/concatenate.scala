package typings.workboxDashStreams.concatenateMod

import typings.workboxDashStreams.typesStreamSourceMod.StreamSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-streams/concatenate", "concatenate")
@js.native
object concatenate extends js.Object {
  def apply(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateReturn = js.native
}

