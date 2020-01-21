package typings.xregexp

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackref extends js.Object {
  var backref: String
  var regex: RegExp
}

object AnonBackref {
  @scala.inline
  def apply(backref: String, regex: RegExp): AnonBackref = {
    val __obj = js.Dynamic.literal(backref = backref.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBackref]
  }
}

