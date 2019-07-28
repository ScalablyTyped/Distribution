package typings.atUirouterCore

import typings.atUirouterCore.libCommonGlobMod.Glob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameGlob extends js.Object {
  /** Might be null */
  var nameGlob: js.UndefOr[Glob] = js.undefined
}

object Anon_NameGlob {
  @scala.inline
  def apply(nameGlob: Glob = null): Anon_NameGlob = {
    val __obj = js.Dynamic.literal()
    if (nameGlob != null) __obj.updateDynamic("nameGlob")(nameGlob)
    __obj.asInstanceOf[Anon_NameGlob]
  }
}

