package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeDeleted extends js.Object {
  var excludeDeleted: scala.Double
  var includeDeleted: scala.Double
  var onlyDeleted: scala.Double
}

object Anon_ExcludeDeleted {
  @scala.inline
  def apply(excludeDeleted: scala.Double, includeDeleted: scala.Double, onlyDeleted: scala.Double): Anon_ExcludeDeleted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("excludeDeleted")(excludeDeleted)
    __obj.updateDynamic("includeDeleted")(includeDeleted)
    __obj.updateDynamic("onlyDeleted")(onlyDeleted)
    __obj.asInstanceOf[Anon_ExcludeDeleted]
  }
}

