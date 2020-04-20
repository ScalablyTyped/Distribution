package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludeDeleted extends js.Object {
  var excludeDeleted: Double
  var includeDeleted: Double
  var onlyDeleted: Double
}

object AnonExcludeDeleted {
  @scala.inline
  def apply(excludeDeleted: Double, includeDeleted: Double, onlyDeleted: Double): AnonExcludeDeleted = {
    val __obj = js.Dynamic.literal(excludeDeleted = excludeDeleted.asInstanceOf[js.Any], includeDeleted = includeDeleted.asInstanceOf[js.Any], onlyDeleted = onlyDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludeDeleted]
  }
}

