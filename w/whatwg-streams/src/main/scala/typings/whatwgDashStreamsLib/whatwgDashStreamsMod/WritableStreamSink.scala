package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableStreamSink[W] extends js.Object {
  var abort: js.UndefOr[js.Function1[/* reason */ js.Any, scala.Unit | js.Promise[_]]] = js.undefined
  var close: js.UndefOr[
    js.Function1[/* controller */ WritableStreamDefaultController[W], scala.Unit | js.Promise[_]]
  ] = js.undefined
  var start: js.UndefOr[
    js.Function1[/* controller */ WritableStreamDefaultController[W], scala.Unit | js.Promise[_]]
  ] = js.undefined
  var write: js.UndefOr[
    js.Function2[
      /* chunk */ W, 
      /* controller */ js.UndefOr[WritableStreamDefaultController[W]], 
      scala.Unit | js.Promise[_]
    ]
  ] = js.undefined
}

object WritableStreamSink {
  @scala.inline
  def apply[W](
    abort: js.Function1[/* reason */ js.Any, scala.Unit | js.Promise[_]] = null,
    close: js.Function1[/* controller */ WritableStreamDefaultController[W], scala.Unit | js.Promise[_]] = null,
    start: js.Function1[/* controller */ WritableStreamDefaultController[W], scala.Unit | js.Promise[_]] = null,
    write: js.Function2[
      /* chunk */ W, 
      /* controller */ js.UndefOr[WritableStreamDefaultController[W]], 
      scala.Unit | js.Promise[_]
    ] = null
  ): WritableStreamSink[W] = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(abort)
    if (close != null) __obj.updateDynamic("close")(close)
    if (start != null) __obj.updateDynamic("start")(start)
    if (write != null) __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[WritableStreamSink[W]]
  }
}

