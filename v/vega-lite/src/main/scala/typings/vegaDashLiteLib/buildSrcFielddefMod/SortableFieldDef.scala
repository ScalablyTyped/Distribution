package typings
package vegaDashLiteLib.buildSrcFielddefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableFieldDef[F] extends FieldDef[F] {
  /**
    * Sort order for the encoded field.
    *
    * For continuous fields (quantitative or temporal), `sort` can be either `"ascending"` or `"descending"`.
    *
    * For discrete fields, `sort` can be one of the following:
    * - `"ascending"` or `"descending"` -- for sorting by the values' natural order in Javascript.
    * - [A sort field definition](https://vega.github.io/vega-lite/docs/sort.html#sort-field) for sorting by another field.
    * - [An array specifying the field values in preferred order](https://vega.github.io/vega-lite/docs/sort.html#sort-array). In this case, the sort order will obey the values in the array, followed by any unspecified values in their original order.  For discrete time field, values in the sort array can be [date-time definition objects](types#datetime). In addition, for time units `"month"` and `"day"`, the values can be the month or day names (case insensitive) or their 3-letter initials (e.g., `"Mon"`, `"Tue"`).
    * - `null` indicating no sort.
    *
    * __Default value:__ `"ascending"`
    *
    * __Note:__ `null` is not supported for `row` and `column`.
    */
  var sort: js.UndefOr[vegaDashLiteLib.buildSrcSortMod.Sort[F]] = js.undefined
}

object SortableFieldDef {
  @scala.inline
  def apply[F](
    `type`: vegaDashLiteLib.buildSrcTypeMod.Type,
    aggregate: Aggregate = null,
    bin: scala.Boolean | vegaDashLiteLib.buildSrcBinMod.BinParams = null,
    field: F = null,
    sort: vegaDashLiteLib.buildSrcSortMod.Sort[F] = null,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null,
    title: java.lang.String = null
  ): SortableFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SortableFieldDef[F]]
  }
}

