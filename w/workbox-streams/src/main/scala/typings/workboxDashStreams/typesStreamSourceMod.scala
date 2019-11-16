package typings.workboxDashStreams

import typings.std.BodyInit
import typings.std.ReadableStream
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-streams/types/StreamSource", JSImport.Namespace)
@js.native
object typesStreamSourceMod extends js.Object {
  type StreamSource = Response | BodyInit | ReadableStream[js.Any]
}

