package typings.write.anon

import typings.node.fsMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<node.fs.MakeDirectoryOptions, 'recursive'> */
trait OmitMakeDirectoryOptionsr extends js.Object {
  var mode: js.UndefOr[Mode] = js.undefined
}

object OmitMakeDirectoryOptionsr {
  @scala.inline
  def apply(mode: Mode = null): OmitMakeDirectoryOptionsr = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitMakeDirectoryOptionsr]
  }
}

