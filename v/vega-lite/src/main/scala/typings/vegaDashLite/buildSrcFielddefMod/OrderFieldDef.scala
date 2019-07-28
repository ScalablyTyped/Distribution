package typings.vegaDashLite.buildSrcFielddefMod

import typings.vegaDashLite.buildSrcBinMod.BinParams
import typings.vegaDashLite.buildSrcSortMod.SortOrder
import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
import typings.vegaDashLite.buildSrcTypeMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderFieldDef[F] extends FieldDef[F] {
  /**
    * The sort order. One of `"ascending"` (default) or `"descending"`.
    */
  var sort: js.UndefOr[SortOrder] = js.undefined
}

object OrderFieldDef {
  @scala.inline
  def apply[F](
    `type`: Type,
    aggregate: Aggregate = null,
    bin: Boolean | BinParams = null,
    field: F = null,
    sort: SortOrder = null,
    timeUnit: TimeUnit = null,
    title: String = null
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

