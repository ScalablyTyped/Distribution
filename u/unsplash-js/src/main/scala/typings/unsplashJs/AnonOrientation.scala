package typings.unsplashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrientation extends js.Object {
  var collections: js.UndefOr[js.Array[String]] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
}

object AnonOrientation {
  @scala.inline
  def apply(collections: js.Array[String] = null, orientation: String = null): AnonOrientation = {
    val __obj = js.Dynamic.literal()
    if (collections != null) __obj.updateDynamic("collections")(collections.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrientation]
  }
}

