package typings.vinylFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirMode extends js.Object {
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

object DirMode {
  @scala.inline
  def apply(cwd: String = null, dirMode: js.UndefOr[Double] = js.undefined): DirMode = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(dirMode)) __obj.updateDynamic("dirMode")(dirMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirMode]
  }
}

