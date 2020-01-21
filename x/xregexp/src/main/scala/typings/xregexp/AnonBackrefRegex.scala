package typings.xregexp

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackrefRegex extends js.Object {
  var backref: Double
  var regex: RegExp
}

object AnonBackrefRegex {
  @scala.inline
  def apply(backref: Double, regex: RegExp): AnonBackrefRegex = {
    val __obj = js.Dynamic.literal(backref = backref.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBackrefRegex]
  }
}

