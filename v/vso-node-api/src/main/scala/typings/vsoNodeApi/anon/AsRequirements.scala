package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsRequirements extends js.Object {
  var asRequirements: scala.Double
  var asTasks: scala.Double
  var off: scala.Double
}

object AsRequirements {
  @scala.inline
  def apply(asRequirements: scala.Double, asTasks: scala.Double, off: scala.Double): AsRequirements = {
    val __obj = js.Dynamic.literal(asRequirements = asRequirements.asInstanceOf[js.Any], asTasks = asTasks.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsRequirements]
  }
}

