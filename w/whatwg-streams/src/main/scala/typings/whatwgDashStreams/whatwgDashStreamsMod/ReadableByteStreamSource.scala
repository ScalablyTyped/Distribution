package typings.whatwgDashStreams.whatwgDashStreamsMod

import typings.whatwgDashStreams.whatwgDashStreamsStrings.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableByteStreamSource extends js.Object {
  var autoAllocateChunkSize: js.UndefOr[Double] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* reason */ js.Any, Unit | js.Promise[_]]] = js.undefined
  var pull: js.UndefOr[
    js.Function1[/* controller */ ReadableByteStreamController, Unit | js.Promise[_]]
  ] = js.undefined
  var start: js.UndefOr[
    js.Function1[/* controller */ ReadableByteStreamController, Unit | js.Promise[_]]
  ] = js.undefined
  var `type`: bytes
}

object ReadableByteStreamSource {
  @scala.inline
  def apply(
    `type`: bytes,
    autoAllocateChunkSize: Int | Double = null,
    cancel: /* reason */ js.Any => Unit | js.Promise[_] = null,
    pull: /* controller */ ReadableByteStreamController => Unit | js.Promise[_] = null,
    start: /* controller */ ReadableByteStreamController => Unit | js.Promise[_] = null
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

