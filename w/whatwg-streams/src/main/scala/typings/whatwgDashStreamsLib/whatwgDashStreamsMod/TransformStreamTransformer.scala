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

object TransformStreamTransformer {
  @scala.inline
  def apply[R, W](
    flush: js.Function1[/* controller */ TransformStreamDefaultController[R], scala.Unit | js.Promise[_]] = null,
    start: js.Function1[/* controller */ TransformStreamDefaultController[R], scala.Unit | js.Promise[_]] = null,
    transform: js.Function2[
      /* chunk */ W, 
      /* controller */ TransformStreamDefaultController[R], 
      scala.Unit | js.Promise[_]
    ] = null
  ): TransformStreamTransformer[R, W] = {
    val __obj = js.Dynamic.literal()
    if (flush != null) __obj.updateDynamic("flush")(flush)
    if (start != null) __obj.updateDynamic("start")(start)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[TransformStreamTransformer[R, W]]
  }
}

