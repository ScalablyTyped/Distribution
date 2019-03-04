package typings
package typescriptLib.typescriptMod.tsNs.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoverTypings extends TypingInstallerRequestWithProjectName {
  val cachePath: js.UndefOr[java.lang.String] = js.undefined
  val compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions
  val fileNames: js.Array[java.lang.String]
  val kind: typescriptLib.typescriptLibStrings.discover
  val projectRootPath: typescriptLib.typescriptMod.tsNs.Path
  val typeAcquisition: typescriptLib.typescriptMod.tsNs.TypeAcquisition
  val unresolvedImports: typescriptLib.typescriptMod.tsNs.SortedReadonlyArray[java.lang.String]
}

object DiscoverTypings {
  @scala.inline
  def apply(
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    fileNames: js.Array[java.lang.String],
    kind: typescriptLib.typescriptLibStrings.discover,
    projectName: java.lang.String,
    projectRootPath: typescriptLib.typescriptMod.tsNs.Path,
    typeAcquisition: typescriptLib.typescriptMod.tsNs.TypeAcquisition,
    unresolvedImports: typescriptLib.typescriptMod.tsNs.SortedReadonlyArray[java.lang.String],
    cachePath: java.lang.String = null
  ): DiscoverTypings = {
    val __obj = js.Dynamic.literal(compilerOptions = compilerOptions, fileNames = fileNames, kind = kind, projectName = projectName, projectRootPath = projectRootPath, typeAcquisition = typeAcquisition, unresolvedImports = unresolvedImports)
    if (cachePath != null) __obj.updateDynamic("cachePath")(cachePath)
    __obj.asInstanceOf[DiscoverTypings]
  }
}

