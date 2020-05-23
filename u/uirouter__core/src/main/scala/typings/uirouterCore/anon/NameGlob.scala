package typings.uirouterCore.anon

import typings.uirouterCore.globMod.Glob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameGlob extends js.Object {
  /** Might be null */
  var nameGlob: js.UndefOr[Glob] = js.undefined
}

object NameGlob {
  @scala.inline
  def apply(nameGlob: Glob = null): NameGlob = {
    val __obj = js.Dynamic.literal()
    if (nameGlob != null) __obj.updateDynamic("nameGlob")(nameGlob.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameGlob]
  }
}

