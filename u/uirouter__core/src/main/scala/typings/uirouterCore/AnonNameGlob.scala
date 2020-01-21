package typings.uirouterCore

import typings.uirouterCore.globMod.Glob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameGlob extends js.Object {
  /** Might be null */
  var nameGlob: js.UndefOr[Glob] = js.undefined
}

object AnonNameGlob {
  @scala.inline
  def apply(nameGlob: Glob = null): AnonNameGlob = {
    val __obj = js.Dynamic.literal()
    if (nameGlob != null) __obj.updateDynamic("nameGlob")(nameGlob.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameGlob]
  }
}

