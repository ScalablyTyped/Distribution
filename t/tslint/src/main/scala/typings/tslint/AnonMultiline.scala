package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMultiline extends js.Object {
  var multiline: String
  var singleline: String
}

object AnonMultiline {
  @scala.inline
  def apply(multiline: String, singleline: String): AnonMultiline = {
    val __obj = js.Dynamic.literal(multiline = multiline.asInstanceOf[js.Any], singleline = singleline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMultiline]
  }
}

