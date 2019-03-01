package typings
package tesseractDotJsLib.tesseractDotJsMod.TesseractNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var loaded: js.UndefOr[scala.Double] = js.undefined
  var progress: scala.Double
  var status: java.lang.String
}

object Progress {
  @scala.inline
  def apply(progress: scala.Double, status: java.lang.String, loaded: scala.Int | scala.Double = null): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("status")(status)
    if (loaded != null) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
}

