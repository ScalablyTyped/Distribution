package typings
package tarLib.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends js.Object {
  /**
    * Alias for file.
    */
  var f: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Uses the given file as the input or output of this function.
    */
  var file: js.UndefOr[java.lang.String] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(f: java.lang.String = null, file: java.lang.String = null): FileOptions = {
    val __obj = js.Dynamic.literal()
    if (f != null) __obj.updateDynamic("f")(f)
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[FileOptions]
  }
}

