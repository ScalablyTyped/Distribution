package typings.typescript.mod.server

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Path
import typings.typescript.mod.SortedReadonlyArray
import typings.typescript.mod.TypeAcquisition
import typings.typescript.mod.WatchOptions
import typings.typescript.typescriptStrings.discover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverTypings extends TypingInstallerRequestWithProjectName {
  val cachePath: js.UndefOr[String] = js.native
  val compilerOptions: CompilerOptions = js.native
  val fileNames: js.Array[String] = js.native
  val kind: discover = js.native
  val projectRootPath: Path = js.native
  val typeAcquisition: TypeAcquisition = js.native
  val unresolvedImports: SortedReadonlyArray[String] = js.native
  val watchOptions: js.UndefOr[WatchOptions] = js.native
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
    unresolvedImports: SortedReadonlyArray[String]
  ): DiscoverTypings = {
    val __obj = js.Dynamic.literal(compilerOptions = compilerOptions.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectRootPath = projectRootPath.asInstanceOf[js.Any], typeAcquisition = typeAcquisition.asInstanceOf[js.Any], unresolvedImports = unresolvedImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverTypings]
  }
  @scala.inline
  implicit class DiscoverTypingsOps[Self <: DiscoverTypings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompilerOptions(value: CompilerOptions): Self = this.set("compilerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileNamesVarargs(value: String*): Self = this.set("fileNames", js.Array(value :_*))
    @scala.inline
    def setFileNames(value: js.Array[String]): Self = this.set("fileNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: discover): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectRootPath(value: Path): Self = this.set("projectRootPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAcquisition(value: TypeAcquisition): Self = this.set("typeAcquisition", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnresolvedImports(value: SortedReadonlyArray[String]): Self = this.set("unresolvedImports", value.asInstanceOf[js.Any])
    @scala.inline
    def setCachePath(value: String): Self = this.set("cachePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachePath: Self = this.set("cachePath", js.undefined)
    @scala.inline
    def setWatchOptions(value: WatchOptions): Self = this.set("watchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchOptions: Self = this.set("watchOptions", js.undefined)
  }
  
}

