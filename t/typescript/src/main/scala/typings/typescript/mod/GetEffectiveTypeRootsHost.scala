package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEffectiveTypeRootsHost extends js.Object {
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, Boolean]] = js.undefined
  var getCurrentDirectory: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object GetEffectiveTypeRootsHost {
  @scala.inline
  def apply(
    directoryExists: /* directoryName */ java.lang.String => Boolean = null,
    getCurrentDirectory: () => java.lang.String = null
  ): GetEffectiveTypeRootsHost = {
    val __obj = js.Dynamic.literal()
    if (directoryExists != null) __obj.updateDynamic("directoryExists")(js.Any.fromFunction1(directoryExists))
    if (getCurrentDirectory != null) __obj.updateDynamic("getCurrentDirectory")(js.Any.fromFunction0(getCurrentDirectory))
    __obj.asInstanceOf[GetEffectiveTypeRootsHost]
  }
}

