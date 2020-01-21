package typings.waterline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollectionDominant extends js.Object {
  var collection: String
  var dominant: js.UndefOr[Boolean] = js.undefined
  var via: String
}

object AnonCollectionDominant {
  @scala.inline
  def apply(collection: String, via: String, dominant: js.UndefOr[Boolean] = js.undefined): AnonCollectionDominant = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    if (!js.isUndefined(dominant)) __obj.updateDynamic("dominant")(dominant.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollectionDominant]
  }
}

