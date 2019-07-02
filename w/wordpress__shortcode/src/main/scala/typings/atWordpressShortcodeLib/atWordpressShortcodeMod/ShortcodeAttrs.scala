package typings
package atWordpressShortcodeLib.atWordpressShortcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcodeAttrs extends js.Object {
  var named: stdLib.Record[java.lang.String, js.UndefOr[java.lang.String]]
  var numeric: js.Array[java.lang.String]
}

object ShortcodeAttrs {
  @scala.inline
  def apply(
    named: stdLib.Record[java.lang.String, js.UndefOr[java.lang.String]],
    numeric: js.Array[java.lang.String]
  ): ShortcodeAttrs = {
    val __obj = js.Dynamic.literal(named = named, numeric = numeric)
  
    __obj.asInstanceOf[ShortcodeAttrs]
  }
}

