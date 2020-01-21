package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSource extends js.Object {
  var source: String | js.Array[String]
}

object AnonSource {
  @scala.inline
  def apply(source: String | js.Array[String]): AnonSource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSource]
  }
}

