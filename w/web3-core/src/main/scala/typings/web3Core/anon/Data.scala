package typings.web3Core.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: String
  var topics: js.Array[_]
}

object Data {
  @scala.inline
  def apply(data: String, topics: js.Array[_]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

