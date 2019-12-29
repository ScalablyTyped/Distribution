package typings.unsplashDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollectionsOrientation extends js.Object {
  var collections: js.UndefOr[js.Array[String]] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
}

object Anon_CollectionsOrientation {
  @scala.inline
  def apply(collections: js.Array[String] = null, orientation: String = null): Anon_CollectionsOrientation = {
    val __obj = js.Dynamic.literal()
    if (collections != null) __obj.updateDynamic("collections")(collections.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CollectionsOrientation]
  }
}

