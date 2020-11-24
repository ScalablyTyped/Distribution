package typings.workboxStreams.concatenateToResponseMod

import typings.std.HeadersInit
import typings.workboxStreams.streamSourceMod.StreamSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-streams/concatenateToResponse", "concatenateToResponse")
@js.native
object concatenateToResponse extends js.Object {
  
  def apply(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateToResponseReturn = js.native
  def apply(sourcePromises: js.Array[js.Promise[StreamSource]], headersInit: HeadersInit): ConcatenateToResponseReturn = js.native
}
