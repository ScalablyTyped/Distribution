package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamSource[R] extends js.Object {
  var cancel: js.UndefOr[js.Function1[/* reason */ js.Any, scala.Unit | js.Promise[_]]] = js.undefined
  var pull: js.UndefOr[
    js.Function1[/* controller */ ReadableStreamDefaultController[R], scala.Unit | js.Promise[_]]
  ] = js.undefined
  var start: js.UndefOr[
    js.Function1[/* controller */ ReadableStreamDefaultController[R], scala.Unit | js.Promise[_]]
  ] = js.undefined
}

object ReadableStreamSource {
  @scala.inline
  def apply[R](
    cancel: js.Function1[/* reason */ js.Any, scala.Unit | js.Promise[_]] = null,
    pull: js.Function1[/* controller */ ReadableStreamDefaultController[R], scala.Unit | js.Promise[_]] = null,
    start: js.Function1[/* controller */ ReadableStreamDefaultController[R], scala.Unit | js.Promise[_]] = null
  ): ReadableStreamSource[R] = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (pull != null) __obj.updateDynamic("pull")(pull)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[ReadableStreamSource[R]]
  }
}

