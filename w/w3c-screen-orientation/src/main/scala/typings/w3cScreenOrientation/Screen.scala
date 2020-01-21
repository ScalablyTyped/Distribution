package typings.w3cScreenOrientation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Screen extends js.Object {
  val orientation: ScreenOrientation
}

object Screen {
  @scala.inline
  def apply(orientation: ScreenOrientation): Screen = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Screen]
  }
}

