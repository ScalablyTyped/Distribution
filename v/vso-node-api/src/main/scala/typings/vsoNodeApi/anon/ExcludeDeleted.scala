package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludeDeleted extends js.Object {
  var excludeDeleted: scala.Double
  var includeDeleted: scala.Double
  var onlyDeleted: scala.Double
}

object ExcludeDeleted {
  @scala.inline
  def apply(excludeDeleted: scala.Double, includeDeleted: scala.Double, onlyDeleted: scala.Double): ExcludeDeleted = {
    val __obj = js.Dynamic.literal(excludeDeleted = excludeDeleted.asInstanceOf[js.Any], includeDeleted = includeDeleted.asInstanceOf[js.Any], onlyDeleted = onlyDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeDeleted]
  }
}

