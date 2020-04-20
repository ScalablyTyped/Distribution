package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCharSet extends js.Object {
  var charSet: String
  var path: String
  var result: String
  var scanType: String
}

object AnonCharSet {
  @scala.inline
  def apply(charSet: String, path: String, result: String, scanType: String): AnonCharSet = {
    val __obj = js.Dynamic.literal(charSet = charSet.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], scanType = scanType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCharSet]
  }
}

