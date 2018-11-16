package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReadableByteStreamSource extends js.Object {
  var autoAllocateChunkSize: js.UndefOr[scala.Double] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* reason */ js.Any, scala.Unit | stdLib.Promise[_]]] = js.undefined
  var pull: js.UndefOr[
    js.Function1[/* controller */ ReadableByteStreamController, scala.Unit | stdLib.Promise[_]]
  ] = js.undefined
  var start: js.UndefOr[
    js.Function1[/* controller */ ReadableByteStreamController, scala.Unit | stdLib.Promise[_]]
  ] = js.undefined
  var `type`: whatwgDashStreamsLib.whatwgDashStreamsLibStrings.bytes
}

