package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleSpecifierResolutionHost extends GetEffectiveTypeRootsHost {
  var fileExists: js.UndefOr[js.Function1[/* path */ java.lang.String, Boolean]] = js.undefined
  var readFile: js.UndefOr[js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]] = js.undefined
  var useCaseSensitiveFileNames: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object ModuleSpecifierResolutionHost {
  @scala.inline
  def apply(
    directoryExists: /* directoryName */ java.lang.String => Boolean = null,
    fileExists: /* path */ java.lang.String => Boolean = null,
    getCurrentDirectory: () => java.lang.String = null,
    readFile: /* path */ java.lang.String => js.UndefOr[java.lang.String] = null,
    useCaseSensitiveFileNames: () => Boolean = null
  ): ModuleSpecifierResolutionHost = {
    val __obj = js.Dynamic.literal()
    if (directoryExists != null) __obj.updateDynamic("directoryExists")(js.Any.fromFunction1(directoryExists))
    if (fileExists != null) __obj.updateDynamic("fileExists")(js.Any.fromFunction1(fileExists))
    if (getCurrentDirectory != null) __obj.updateDynamic("getCurrentDirectory")(js.Any.fromFunction0(getCurrentDirectory))
    if (readFile != null) __obj.updateDynamic("readFile")(js.Any.fromFunction1(readFile))
    if (useCaseSensitiveFileNames != null) __obj.updateDynamic("useCaseSensitiveFileNames")(js.Any.fromFunction0(useCaseSensitiveFileNames))
    __obj.asInstanceOf[ModuleSpecifierResolutionHost]
  }
}

