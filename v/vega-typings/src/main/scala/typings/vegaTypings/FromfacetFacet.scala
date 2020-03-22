package typings.vegaTypings

import typings.vegaTypings.markMod.Facet
import typings.vegaTypings.markMod.FromFacet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/spec/mark.From & {  facet  :vega-typings.vega-typings/types/spec/mark.Facet} */
trait FromfacetFacet extends FromFacet {
  var data: js.UndefOr[String] = js.undefined
  var facet: Facet
}

object FromfacetFacet {
  @scala.inline
  def apply(facet: Facet, data: String = null): FromfacetFacet = {
    val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromfacetFacet]
  }
}

