package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileReference extends TextRange {
  var fileName: java.lang.String
}

object FileReference {
  @scala.inline
  def apply(end: scala.Double, fileName: java.lang.String, pos: scala.Double): FileReference = {
    val __obj = js.Dynamic.literal(end = end, fileName = fileName, pos = pos)
  
    __obj.asInstanceOf[FileReference]
  }
}

