package typings.web3Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: String
  var topics: js.Array[_]
}

object AnonData {
  @scala.inline
  def apply(data: String, topics: js.Array[_]): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

