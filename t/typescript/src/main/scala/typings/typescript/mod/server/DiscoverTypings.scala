package typings.typescript.mod.server

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Path
import typings.typescript.mod.SortedReadonlyArray
import typings.typescript.mod.TypeAcquisition
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
    val __obj = js.Dynamic.literal(compilerOptions = compilerOptions.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectRootPath = projectRootPath.asInstanceOf[js.Any], typeAcquisition = typeAcquisition.asInstanceOf[js.Any], unresolvedImports = unresolvedImports.asInstanceOf[js.Any])
    if (cachePath != null) __obj.updateDynamic("cachePath")(cachePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverTypings]
  }
}

