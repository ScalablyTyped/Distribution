package typings.typescript.typescriptMod.serverNs

import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.Path
import typings.typescript.typescriptMod.SortedReadonlyArray
import typings.typescript.typescriptMod.TypeAcquisition
import typings.typescript.typescriptStrings.discover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoverTypings extends TypingInstallerRequestWithProjectName {
  val cachePath: js.UndefOr[String] = js.undefined
  val compilerOptions: CompilerOptions
  val fileNames: js.Array[String]
  val kind: discover
  val projectRootPath: Path
  val typeAcquisition: TypeAcquisition
  val unresolvedImports: SortedReadonlyArray[String]
}

object DiscoverTypings {
  @scala.inline
  def apply(
    compilerOptions: CompilerOptions,
    fileNames: js.Array[String],
    kind: discover,
    projectName: String,
    projectRootPath: Path,
    typeAcquisition: TypeAcquisition,
    unresolvedImports: SortedReadonlyArray[String],
    cachePath: String = null
  ): DiscoverTypings = {
    val __obj = js.Dynamic.literal(compilerOptions = compilerOptions, fileNames = fileNames, kind = kind, projectName = projectName, projectRootPath = projectRootPath, typeAcquisition = typeAcquisition, unresolvedImports = unresolvedImports)
    if (cachePath != null) __obj.updateDynamic("cachePath")(cachePath)
    __obj.asInstanceOf[DiscoverTypings]
  }
}

