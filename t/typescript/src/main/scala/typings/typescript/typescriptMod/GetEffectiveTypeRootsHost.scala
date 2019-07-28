package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEffectiveTypeRootsHost extends js.Object {
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ String, Boolean]] = js.undefined
  var getCurrentDirectory: js.UndefOr[js.Function0[String]] = js.undefined
}

object GetEffectiveTypeRootsHost {
  @scala.inline
  def apply(
    directoryExists: /* directoryName */ String => Boolean = null,
    getCurrentDirectory: () => String = null
  ): GetEffectiveTypeRootsHost = {
    val __obj = js.Dynamic.literal()
    if (directoryExists != null) __obj.updateDynamic("directoryExists")(js.Any.fromFunction1(directoryExists))
    if (getCurrentDirectory != null) __obj.updateDynamic("getCurrentDirectory")(js.Any.fromFunction0(getCurrentDirectory))
    __obj.asInstanceOf[GetEffectiveTypeRootsHost]
  }
}

