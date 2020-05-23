package typings.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var loaded: js.UndefOr[Double] = js.undefined
  var progress: Double
  var status: String
}

object Progress {
  @scala.inline
  def apply(progress: Double, status: String, loaded: js.UndefOr[Double] = js.undefined): Progress = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
}

