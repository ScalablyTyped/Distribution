package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedCommandLine extends js.Object {
  var compileOnSave: js.UndefOr[Boolean] = js.undefined
  var errors: js.Array[Diagnostic]
  var fileNames: js.Array[java.lang.String]
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
    fileNames: js.Array[java.lang.String],
    options: CompilerOptions,
    compileOnSave: js.UndefOr[Boolean] = js.undefined,
    projectReferences: js.Array[ProjectReference] = null,
    raw: js.Any = null,
    typeAcquisition: TypeAcquisition = null,
    wildcardDirectories: MapLike[WatchDirectoryFlags] = null
  ): ParsedCommandLine = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (!js.isUndefined(compileOnSave)) __obj.updateDynamic("compileOnSave")(compileOnSave.asInstanceOf[js.Any])
    if (projectReferences != null) __obj.updateDynamic("projectReferences")(projectReferences.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (typeAcquisition != null) __obj.updateDynamic("typeAcquisition")(typeAcquisition.asInstanceOf[js.Any])
    if (wildcardDirectories != null) __obj.updateDynamic("wildcardDirectories")(wildcardDirectories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedCommandLine]
  }
}

