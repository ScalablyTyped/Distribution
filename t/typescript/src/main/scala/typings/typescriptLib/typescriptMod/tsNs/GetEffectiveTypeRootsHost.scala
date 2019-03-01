package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEffectiveTypeRootsHost extends js.Object {
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, scala.Boolean]] = js.undefined
  var getCurrentDirectory: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object GetEffectiveTypeRootsHost {
  @scala.inline
  def apply(
    directoryExists: js.Function1[/* directoryName */ java.lang.String, scala.Boolean] = null,
    getCurrentDirectory: js.Function0[java.lang.String] = null
  ): GetEffectiveTypeRootsHost = {
    val __obj = js.Dynamic.literal()
    if (directoryExists != null) __obj.updateDynamic("directoryExists")(directoryExists)
    if (getCurrentDirectory != null) __obj.updateDynamic("getCurrentDirectory")(getCurrentDirectory)
    __obj.asInstanceOf[GetEffectiveTypeRootsHost]
  }
}

