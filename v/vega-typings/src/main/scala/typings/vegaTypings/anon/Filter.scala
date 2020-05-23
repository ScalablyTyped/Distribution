package typings.vegaTypings.anon

import typings.vegaTypings.vegaTypingsStrings.exterior
import typings.vegaTypings.vegaTypingsStrings.interior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var filter: interior | exterior | Null
  var mesh: String
}

object Filter {
  @scala.inline
  def apply(mesh: String, filter: interior | exterior = null): Filter = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

