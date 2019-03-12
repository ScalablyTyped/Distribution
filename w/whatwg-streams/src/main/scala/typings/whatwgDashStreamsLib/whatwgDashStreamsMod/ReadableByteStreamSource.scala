package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableByteStreamSource extends js.Object {
  var autoAllocateChunkSize: js.UndefOr[scala.Double] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* reason */ js.Any, scala.Unit | js.Promise[_]]] = js.undefined
  var pull: js.UndefOr[
    js.Function1[/* controller */ ReadableByteStreamController, scala.Unit | js.Promise[_]]
  ] = js.undefined
  var start: js.UndefOr[
    js.Function1[/* controller */ ReadableByteStreamController, scala.Unit | js.Promise[_]]
  ] = js.undefined
  var `type`: whatwgDashStreamsLib.whatwgDashStreamsLibStrings.bytes
}

object ReadableByteStreamSource {
  @scala.inline
  def apply(
    `type`: whatwgDashStreamsLib.whatwgDashStreamsLibStrings.bytes,
    autoAllocateChunkSize: scala.Int | scala.Double = null,
    cancel: /* reason */ js.Any => scala.Unit | js.Promise[_] = null,
    pull: /* controller */ ReadableByteStreamController => scala.Unit | js.Promise[_] = null,
    start: /* controller */ ReadableByteStreamController => scala.Unit | js.Promise[_] = null
  ): ReadableByteStreamSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (autoAllocateChunkSize != null) __obj.updateDynamic("autoAllocateChunkSize")(autoAllocateChunkSize.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (pull != null) __obj.updateDynamic("pull")(js.Any.fromFunction1(pull))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    __obj.asInstanceOf[ReadableByteStreamSource]
  }
}

