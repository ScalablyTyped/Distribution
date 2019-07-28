package typings.sudokus.sudokusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var onProgress: js.UndefOr[ProgressFn] = js.undefined
}

object Options {
  @scala.inline
  def apply(onProgress: ProgressFn = null): Options = {
    val __obj = js.Dynamic.literal()
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    __obj.asInstanceOf[Options]
  }
}

