package typings.sudokus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var onProgress: js.UndefOr[ProgressFn] = js.undefined
}

object Options {
  @scala.inline
  def apply(onProgress: /* state */ js.Array[js.Array[Cell]] => Unit = null): Options = {
    val __obj = js.Dynamic.literal()
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    __obj.asInstanceOf[Options]
  }
}

