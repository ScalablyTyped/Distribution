package typings.webcola.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DesiredCenter extends js.Object {
  var desiredCenter: Double
  var size: Double
}

object DesiredCenter {
  @scala.inline
  def apply(desiredCenter: Double, size: Double): DesiredCenter = {
    val __obj = js.Dynamic.literal(desiredCenter = desiredCenter.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesiredCenter]
  }
}

