package typings
package xregexpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackrefRegex extends js.Object {
  var backref: scala.Double
  var regex: stdLib.RegExp
}

object Anon_BackrefRegex {
  @scala.inline
  def apply(backref: scala.Double, regex: stdLib.RegExp): Anon_BackrefRegex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backref")(backref)
    __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_BackrefRegex]
  }
}

