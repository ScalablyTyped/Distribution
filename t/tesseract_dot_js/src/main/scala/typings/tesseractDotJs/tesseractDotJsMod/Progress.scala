package typings.tesseractDotJs.tesseractDotJsMod

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
  def apply(progress: Double, status: String, loaded: Int | Double = null): Progress = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (loaded != null) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
}

