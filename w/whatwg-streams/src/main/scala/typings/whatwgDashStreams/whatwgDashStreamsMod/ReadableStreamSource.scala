package typings.whatwgDashStreams.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamSource[R] extends js.Object {
  var cancel: js.UndefOr[js.Function1[/* reason */ js.Any, Unit | js.Promise[_]]] = js.undefined
  var pull: js.UndefOr[
    js.Function1[/* controller */ ReadableStreamDefaultController[R], Unit | js.Promise[_]]
  ] = js.undefined
  var start: js.UndefOr[
    js.Function1[/* controller */ ReadableStreamDefaultController[R], Unit | js.Promise[_]]
  ] = js.undefined
}

object ReadableStreamSource {
  @scala.inline
  def apply[R](
    cancel: /* reason */ js.Any => Unit | js.Promise[_] = null,
    pull: /* controller */ ReadableStreamDefaultController[R] => Unit | js.Promise[_] = null,
    start: /* controller */ ReadableStreamDefaultController[R] => Unit | js.Promise[_] = null
  ): ReadableStreamSource[R] = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (pull != null) __obj.updateDynamic("pull")(js.Any.fromFunction1(pull))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    __obj.asInstanceOf[ReadableStreamSource[R]]
  }
}

