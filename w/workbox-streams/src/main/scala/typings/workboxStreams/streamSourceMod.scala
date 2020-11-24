package typings.workboxStreams

import typings.std.BodyInit
import typings.std.ReadableStream
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-streams/types/StreamSource", JSImport.Namespace)
@js.native
object streamSourceMod extends js.Object {
  
  type StreamSource = Response | BodyInit | ReadableStream[js.Any]
}
