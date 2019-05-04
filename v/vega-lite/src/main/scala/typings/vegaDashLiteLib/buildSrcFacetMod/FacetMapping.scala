package typings
package vegaDashLiteLib.buildSrcFacetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacetMapping[F] extends js.Object {
  /**
    * Horizontal facets for trellis plots.
    */
  var column: js.UndefOr[FacetFieldDef[F]] = js.undefined
  /**
    * Vertical facets for trellis plots.
    */
  var row: js.UndefOr[FacetFieldDef[F]] = js.undefined
}

object FacetMapping {
  @scala.inline
  def apply[F](column: FacetFieldDef[F] = null, row: FacetFieldDef[F] = null): FacetMapping[F] = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (row != null) __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[FacetMapping[F]]
  }
}

