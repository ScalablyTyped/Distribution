package typings
package vegaDashLiteLib.buildSrcFielddefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderFieldDef[F] extends FieldDef[F] {
  /**
    * The sort order. One of `"ascending"` (default) or `"descending"`.
    */
  var sort: js.UndefOr[vegaDashLiteLib.buildSrcSortMod.SortOrder] = js.undefined
}

object OrderFieldDef {
  @scala.inline
  def apply[F](
    `type`: vegaDashLiteLib.buildSrcTypeMod.Type,
    aggregate: Aggregate = null,
    bin: scala.Boolean | vegaDashLiteLib.buildSrcBinMod.BinParams = null,
    field: F = null,
    sort: vegaDashLiteLib.buildSrcSortMod.SortOrder = null,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null,
    title: java.lang.String = null
  ): OrderFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[OrderFieldDef[F]]
  }
}

