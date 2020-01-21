package typings.waterline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollection extends js.Object {
  var collection: String
  var via: String
}

object AnonCollection {
  @scala.inline
  def apply(collection: String, via: String): AnonCollection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCollection]
  }
}

