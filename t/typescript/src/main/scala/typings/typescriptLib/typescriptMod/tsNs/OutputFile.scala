package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFile extends js.Object {
  var name: java.lang.String
  var text: java.lang.String
  var writeByteOrderMark: scala.Boolean
}

object OutputFile {
  @scala.inline
  def apply(name: java.lang.String, text: java.lang.String, writeByteOrderMark: scala.Boolean): OutputFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("writeByteOrderMark")(writeByteOrderMark)
    __obj.asInstanceOf[OutputFile]
  }
}

