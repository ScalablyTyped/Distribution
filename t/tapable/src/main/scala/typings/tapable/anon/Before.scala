package typings.tapable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Before extends js.Object {
  var before: js.UndefOr[String | js.Array[String]] = js.undefined
  var context: js.UndefOr[Boolean] = js.undefined
  var name: String
  var stage: js.UndefOr[Double] = js.undefined
}

object Before {
  @scala.inline
  def apply(
    name: String,
    before: String | js.Array[String] = null,
    context: js.UndefOr[Boolean] = js.undefined,
    stage: js.UndefOr[Double] = js.undefined
  ): Before = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stage)) __obj.updateDynamic("stage")(stage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Before]
  }
}

