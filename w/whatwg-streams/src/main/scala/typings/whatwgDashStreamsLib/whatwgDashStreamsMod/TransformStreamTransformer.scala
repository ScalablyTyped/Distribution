package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformStreamTransformer[R, W] extends js.Object {
  var flush: js.UndefOr[
    js.Function1[/* controller */ TransformStreamDefaultController[R], scala.Unit | js.Promise[_]]
  ] = js.undefined
  var start: js.UndefOr[
    js.Function1[/* controller */ TransformStreamDefaultController[R], scala.Unit | js.Promise[_]]
  ] = js.undefined
  var transform: js.UndefOr[
    js.Function2[
      /* chunk */ W, 
      /* controller */ TransformStreamDefaultController[R], 
      scala.Unit | js.Promise[_]
    ]
  ] = js.undefined
}

