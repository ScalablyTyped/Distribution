package typings.strongLogTransformer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<strong-log-transformer.strong-log-transformer.Options> */
trait PartialOptions extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var mergeMultiline: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var timeStamp: js.UndefOr[Boolean] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    format: String = null,
    mergeMultiline: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    timeStamp: js.UndefOr[Boolean] = js.undefined
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeMultiline)) __obj.updateDynamic("mergeMultiline")(mergeMultiline.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(timeStamp)) __obj.updateDynamic("timeStamp")(timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

