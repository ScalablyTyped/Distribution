package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedCommandLine extends js.Object {
  var compileOnSave: js.UndefOr[Boolean] = js.undefined
  var errors: js.Array[Diagnostic]
  var fileNames: js.Array[String]
  var options: CompilerOptions
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.undefined
  var raw: js.UndefOr[js.Any] = js.undefined
  var typeAcquisition: js.UndefOr[TypeAcquisition] = js.undefined
  var wildcardDirectories: js.UndefOr[MapLike[WatchDirectoryFlags]] = js.undefined
}

object ParsedCommandLine {
  @scala.inline
  def apply(
    errors: js.Array[Diagnostic],
    fileNames: js.Array[String],
    options: CompilerOptions,
    compileOnSave: js.UndefOr[Boolean] = js.undefined,
    projectReferences: js.Array[ProjectReference] = null,
    raw: js.Any = null,
    typeAcquisition: TypeAcquisition = null,
    wildcardDirectories: MapLike[WatchDirectoryFlags] = null
  ): ParsedCommandLine = {
    val __obj = js.Dynamic.literal(errors = errors, fileNames = fileNames, options = options)
    if (!js.isUndefined(compileOnSave)) __obj.updateDynamic("compileOnSave")(compileOnSave)
    if (projectReferences != null) __obj.updateDynamic("projectReferences")(projectReferences)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (typeAcquisition != null) __obj.updateDynamic("typeAcquisition")(typeAcquisition)
    if (wildcardDirectories != null) __obj.updateDynamic("wildcardDirectories")(wildcardDirectories)
    __obj.asInstanceOf[ParsedCommandLine]
  }
}

