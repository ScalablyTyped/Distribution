package typings.write

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<node.fs.MakeDirectoryOptions, 'recursive'> */
trait OmitMakeDirectoryOptionsr extends js.Object {
  var mode: js.UndefOr[Double] = js.undefined
}

object OmitMakeDirectoryOptionsr {
  @scala.inline
  def apply(mode: Int | Double = null): OmitMakeDirectoryOptionsr = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitMakeDirectoryOptionsr]
  }
}

