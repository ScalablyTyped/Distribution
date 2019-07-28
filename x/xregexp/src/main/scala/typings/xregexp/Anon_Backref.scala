package typings.xregexp

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backref extends js.Object {
  var backref: String
  var regex: RegExp
}

object Anon_Backref {
  @scala.inline
  def apply(backref: String, regex: RegExp): Anon_Backref = {
    val __obj = js.Dynamic.literal(backref = backref, regex = regex)
  
    __obj.asInstanceOf[Anon_Backref]
  }
}

