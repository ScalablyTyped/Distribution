package typings.vinylFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cwd extends js.Object {
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
  /** Specify the mode the directory should be created with. Default is the process mode */
  var mode: js.UndefOr[Double | String] = js.undefined
}

object Cwd {
  @scala.inline
  def apply(cwd: String = null, dirMode: js.UndefOr[Double] = js.undefined, mode: Double | String = null): Cwd = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(dirMode)) __obj.updateDynamic("dirMode")(dirMode.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cwd]
  }
}

