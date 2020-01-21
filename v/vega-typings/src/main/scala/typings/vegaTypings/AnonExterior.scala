package typings.vegaTypings

import typings.vegaTypings.vegaTypingsStrings.exterior
import typings.vegaTypings.vegaTypingsStrings.interior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExterior extends js.Object {
  var filter: interior | exterior | Null
  var mesh: String
}

object AnonExterior {
  @scala.inline
  def apply(mesh: String, filter: interior | exterior = null): AnonExterior = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExterior]
  }
}

