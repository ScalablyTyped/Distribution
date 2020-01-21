package typings.vegaTypings

import typings.vegaTypings.markMod.Facet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFacet extends js.Object {
  var facet: Facet
}

object AnonFacet {
  @scala.inline
  def apply(facet: Facet): AnonFacet = {
    val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFacet]
  }
}

