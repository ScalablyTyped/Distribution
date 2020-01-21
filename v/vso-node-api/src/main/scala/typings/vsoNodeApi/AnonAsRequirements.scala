package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsRequirements extends js.Object {
  var asRequirements: Double
  var asTasks: Double
  var off: Double
}

object AnonAsRequirements {
  @scala.inline
  def apply(asRequirements: Double, asTasks: Double, off: Double): AnonAsRequirements = {
    val __obj = js.Dynamic.literal(asRequirements = asRequirements.asInstanceOf[js.Any], asTasks = asTasks.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAsRequirements]
  }
}

