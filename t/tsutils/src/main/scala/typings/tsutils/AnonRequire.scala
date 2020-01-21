package typings.tsutils

import typings.tsutils.tsutilsStrings.require
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequire extends js.Object {
  var text: require
}

object AnonRequire {
  @scala.inline
  def apply(text: require): AnonRequire = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRequire]
  }
}

