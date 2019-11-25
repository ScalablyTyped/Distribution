package typings.vegaDashTypings

import typings.vegaDashTypings.vegaDashTypingsStrings.exterior
import typings.vegaDashTypings.vegaDashTypingsStrings.interior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exterior extends js.Object {
  var filter: interior | exterior | Null
  var mesh: String
}

object Anon_Exterior {
  @scala.inline
  def apply(mesh: String, filter: interior | exterior = null): Anon_Exterior = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Exterior]
  }
}

