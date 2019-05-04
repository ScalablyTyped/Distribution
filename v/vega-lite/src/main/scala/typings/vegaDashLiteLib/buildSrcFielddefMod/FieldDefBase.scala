package typings
package vegaDashLiteLib.buildSrcFielddefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldDefBase[F] extends js.Object {
  /**
    * Aggregation function for the field
    * (e.g., `mean`, `sum`, `median`, `min`, `max`, `count`).
    *
    * __Default value:__ `undefined` (None)
    */
  var aggregate: js.UndefOr[Aggregate] = js.undefined
  /**
    * A flag for binning a `quantitative` field, or [an object defining binning parameters](https://vega.github.io/vega-lite/docs/bin.html#params).
    * If `true`, default [binning parameters](https://vega.github.io/vega-lite/docs/bin.html) will be applied.
    *
    * __Default value:__ `false`
    */
  var bin: js.UndefOr[scala.Boolean | vegaDashLiteLib.buildSrcBinMod.BinParams] = js.undefined
  /**
    * __Required.__ A string defining the name of the field from which to pull a data value
    * or an object defining iterated values from the [`repeat`](https://vega.github.io/vega-lite/docs/repeat.html) operator.
    *
    * __Note:__ Dots (`.`) and brackets (`[` and `]`) can be used to access nested objects (e.g., `"field": "foo.bar"` and `"field": "foo['bar']"`).
    * If field names contain dots or brackets but are not nested, you can use `\\` to escape dots and brackets (e.g., `"a\\.b"` and `"a\\[0\\]"`).
    * See more details about escaping in the [field documentation](https://vega.github.io/vega-lite/docs/field.html).
    *
    * __Note:__ `field` is not required if `aggregate` is `count`.
    */
  var field: js.UndefOr[F] = js.undefined
  /**
    * Time unit (e.g., `year`, `yearmonth`, `month`, `hours`) for a temporal field.
    * or [a temporal field that gets casted as ordinal](https://vega.github.io/vega-lite/docs/type.html#cast).
    *
    * __Default value:__ `undefined` (None)
    */
  var timeUnit: js.UndefOr[vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit] = js.undefined
}

object FieldDefBase {
  @scala.inline
  def apply[F](
    aggregate: Aggregate = null,
    bin: scala.Boolean | vegaDashLiteLib.buildSrcBinMod.BinParams = null,
    field: F = null,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null
  ): FieldDefBase[F] = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    __obj.asInstanceOf[FieldDefBase[F]]
  }
}

