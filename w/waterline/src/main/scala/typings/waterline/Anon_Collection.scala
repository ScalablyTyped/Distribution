package typings.waterline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collection extends js.Object {
  var collection: String
  var via: String
}

object Anon_Collection {
  @scala.inline
  def apply(collection: String, via: String): Anon_Collection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Collection]
  }
}

