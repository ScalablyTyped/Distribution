package typings
package w3cDashScreenDashOrientationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Screen extends js.Object {
  val orientation: ScreenOrientation
}

object Screen {
  @scala.inline
  def apply(orientation: ScreenOrientation): Screen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("orientation")(orientation)
    __obj.asInstanceOf[Screen]
  }
}

