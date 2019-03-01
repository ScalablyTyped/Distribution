package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameGlob extends js.Object {
  /** Might be null */
  var nameGlob: js.UndefOr[atUirouterCoreLib.libCommonGlobMod.Glob] = js.undefined
}

object Anon_NameGlob {
  @scala.inline
  def apply(nameGlob: atUirouterCoreLib.libCommonGlobMod.Glob = null): Anon_NameGlob = {
    val __obj = js.Dynamic.literal()
    if (nameGlob != null) __obj.updateDynamic("nameGlob")(nameGlob)
    __obj.asInstanceOf[Anon_NameGlob]
  }
}

