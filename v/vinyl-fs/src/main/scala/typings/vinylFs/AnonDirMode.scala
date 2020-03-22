package typings.vinylFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirMode extends js.Object {
  /**
    * Specify the working directory the folder is relative to
    * Default is process.cwd()
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Specify the mode the directory should be created with
    * Default is the process mode
    */
  var dirMode: js.UndefOr[Double] = js.undefined
}

object AnonDirMode {
  @scala.inline
  def apply(cwd: String = null, dirMode: Int | Double = null): AnonDirMode = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (dirMode != null) __obj.updateDynamic("dirMode")(dirMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirMode]
  }
}

