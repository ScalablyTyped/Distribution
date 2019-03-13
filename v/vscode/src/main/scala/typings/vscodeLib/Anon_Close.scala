package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  var close: js.UndefOr[java.lang.String] = js.undefined
  var lineStart: java.lang.String
  var open: java.lang.String
  var scope: java.lang.String
}

object Anon_Close {
  @scala.inline
  def apply(
    lineStart: java.lang.String,
    open: java.lang.String,
    scope: java.lang.String,
    close: java.lang.String = null
  ): Anon_Close = {
    val __obj = js.Dynamic.literal(lineStart = lineStart, open = open, scope = scope)
    if (close != null) __obj.updateDynamic("close")(close)
    __obj.asInstanceOf[Anon_Close]
  }
}

