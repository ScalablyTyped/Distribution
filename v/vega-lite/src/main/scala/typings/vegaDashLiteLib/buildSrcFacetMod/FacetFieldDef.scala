package typings
package vegaDashLiteLib.buildSrcFacetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacetFieldDef[F]
  extends vegaDashLiteLib.buildSrcFielddefMod.SortableFieldDef[F] {
  /**
    * An object defining properties of a facet's header.
    */
  var header: js.UndefOr[vegaDashLiteLib.buildSrcHeaderMod.Header] = js.undefined
}

object FacetFieldDef {
  @scala.inline
  def apply[F](
    `type`: vegaDashLiteLib.buildSrcTypeMod.Type,
    aggregate: vegaDashLiteLib.buildSrcFielddefMod.Aggregate = null,
    bin: scala.Boolean | vegaDashLiteLib.buildSrcBinMod.BinParams = null,
    field: F = null,
    header: vegaDashLiteLib.buildSrcHeaderMod.Header = null,
    sort: vegaDashLiteLib.buildSrcSortMod.Sort[F] = null,
    timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = null,
    title: java.lang.String = null
  ): FacetFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[FacetFieldDef[F]]
  }
}

