package typings.waterline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollectionDominant extends js.Object {
  var collection: String
  var dominant: js.UndefOr[Boolean] = js.undefined
  var via: String
}

object Anon_CollectionDominant {
  @scala.inline
  def apply(collection: String, via: String, dominant: js.UndefOr[Boolean] = js.undefined): Anon_CollectionDominant = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    if (!js.isUndefined(dominant)) __obj.updateDynamic("dominant")(dominant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CollectionDominant]
  }
}

