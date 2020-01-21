package typings.unsplashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollectionsOrientation extends js.Object {
  var collections: js.UndefOr[js.Array[String]] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
}

object AnonCollectionsOrientation {
  @scala.inline
  def apply(collections: js.Array[String] = null, orientation: String = null): AnonCollectionsOrientation = {
    val __obj = js.Dynamic.literal()
    if (collections != null) __obj.updateDynamic("collections")(collections.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollectionsOrientation]
  }
}

