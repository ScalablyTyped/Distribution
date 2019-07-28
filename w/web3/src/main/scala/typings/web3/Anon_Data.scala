package typings.web3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: String
  var topics: js.Array[String]
}

object Anon_Data {
  @scala.inline
  def apply(data: String, topics: js.Array[String]): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, topics = topics)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

