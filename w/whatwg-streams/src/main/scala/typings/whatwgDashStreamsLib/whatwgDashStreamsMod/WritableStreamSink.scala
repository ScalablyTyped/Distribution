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

