package typings.vegaTypings

import typings.vegaTypings.vegaTypingsStrings.exterior
import typings.vegaTypings.vegaTypingsStrings.interior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  var filter: interior | exterior | Null
  var mesh: String
}

object AnonFilter {
  @scala.inline
  def apply(mesh: String, filter: interior | exterior = null): AnonFilter = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilter]
  }
}

