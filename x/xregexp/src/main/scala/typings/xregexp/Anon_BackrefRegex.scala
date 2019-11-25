package typings.xregexp

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackrefRegex extends js.Object {
  var backref: Double
  var regex: RegExp
}

object Anon_BackrefRegex {
  @scala.inline
  def apply(backref: Double, regex: RegExp): Anon_BackrefRegex = {
    val __obj = js.Dynamic.literal(backref = backref.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BackrefRegex]
  }
}

