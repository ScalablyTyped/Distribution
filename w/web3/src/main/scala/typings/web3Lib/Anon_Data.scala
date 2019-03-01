package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: java.lang.String
  var topics: js.Array[java.lang.String]
}

object Anon_Data {
  @scala.inline
  def apply(data: java.lang.String, topics: js.Array[java.lang.String]): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[Anon_Data]
  }
}

