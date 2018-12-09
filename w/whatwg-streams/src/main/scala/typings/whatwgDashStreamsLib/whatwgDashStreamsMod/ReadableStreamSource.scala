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

