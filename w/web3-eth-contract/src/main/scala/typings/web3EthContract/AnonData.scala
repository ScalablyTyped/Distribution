package typings.web3EthContract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: String
  var topics: js.Array[String]
}

object AnonData {
  @scala.inline
  def apply(data: String, topics: js.Array[String]): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

