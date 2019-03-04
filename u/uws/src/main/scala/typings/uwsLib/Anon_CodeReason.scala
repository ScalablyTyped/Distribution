package typings
package uwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeReason extends js.Object {
  var code: scala.Double
  var reason: java.lang.String
  var target: this.type
  var wasClean: scala.Boolean
}

object Anon_CodeReason {
  @scala.inline
  def apply(code: scala.Double, reason: java.lang.String, target: Anon_CodeReason, wasClean: scala.Boolean): Anon_CodeReason = {
    val __obj = js.Dynamic.literal(code = code, reason = reason, target = target, wasClean = wasClean)
  
    __obj.asInstanceOf[Anon_CodeReason]
  }
}

