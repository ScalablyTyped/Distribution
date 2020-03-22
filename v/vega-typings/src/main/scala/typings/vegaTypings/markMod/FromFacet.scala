package typings.vegaTypings.markMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.markMod.From
  - typings.vegaTypings.FromfacetFacet
*/
trait FromFacet extends js.Object

object FromFacet {
  @scala.inline
  def From(data: String = null): FromFacet = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromFacet]
  }
  @scala.inline
  def FromfacetFacet(facet: Facet, data: String = null): FromFacet = {
    val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromFacet]
  }
}

