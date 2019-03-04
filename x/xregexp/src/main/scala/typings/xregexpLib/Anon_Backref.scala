package typings
package xregexpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backref extends js.Object {
  var backref: java.lang.String
  var regex: stdLib.RegExp
}

object Anon_Backref {
  @scala.inline
  def apply(backref: java.lang.String, regex: stdLib.RegExp): Anon_Backref = {
    val __obj = js.Dynamic.literal(backref = backref, regex = regex)
  
    __obj.asInstanceOf[Anon_Backref]
  }
}

