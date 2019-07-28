package typings.whatwgDashStreams.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableStreamSink[W] extends js.Object {
  var abort: js.UndefOr[js.Function1[/* reason */ js.Any, Unit | js.Promise[_]]] = js.undefined
  var close: js.UndefOr[
    js.Function1[/* controller */ WritableStreamDefaultController[W], Unit | js.Promise[_]]
  ] = js.undefined
  var start: js.UndefOr[
    js.Function1[/* controller */ WritableStreamDefaultController[W], Unit | js.Promise[_]]
  ] = js.undefined
  var write: js.UndefOr[
    js.Function2[
      /* chunk */ W, 
      /* controller */ js.UndefOr[WritableStreamDefaultController[W]], 
      Unit | js.Promise[_]
    ]
  ] = js.undefined
}

object WritableStreamSink {
  @scala.inline
  def apply[W](
    abort: /* reason */ js.Any => Unit | js.Promise[_] = null,
    close: /* controller */ WritableStreamDefaultController[W] => Unit | js.Promise[_] = null,
    start: /* controller */ WritableStreamDefaultController[W] => Unit | js.Promise[_] = null,
    write: (/* chunk */ W, /* controller */ js.UndefOr[WritableStreamDefaultController[W]]) => Unit | js.Promise[_] = null
  ): WritableStreamSink[W] = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction1(abort))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction2(write))
    __obj.asInstanceOf[WritableStreamSink[W]]
  }
}

