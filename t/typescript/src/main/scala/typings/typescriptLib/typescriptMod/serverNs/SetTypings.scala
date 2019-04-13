package typings
package typescriptLib.typescriptMod.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTypings extends ProjectResponse {
  val compilerOptions: typescriptLib.typescriptMod.CompilerOptions
  @JSName("kind")
  val kind_SetTypings: ActionSet
  val typeAcquisition: typescriptLib.typescriptMod.TypeAcquisition
  @JSName("typings")
  val typings_ : js.Array[java.lang.String]
  val unresolvedImports: typescriptLib.typescriptMod.SortedReadonlyArray[java.lang.String]
}

object SetTypings {
  @scala.inline
  def apply(
    compilerOptions: typescriptLib.typescriptMod.CompilerOptions,
    kind: ActionSet,
    projectName: java.lang.String,
    typeAcquisition: typescriptLib.typescriptMod.TypeAcquisition,
    typings_ : js.Array[java.lang.String],
    unresolvedImports: typescriptLib.typescriptMod.SortedReadonlyArray[java.lang.String]
  ): SetTypings = {
    val __obj = js.Dynamic.literal(compilerOptions = compilerOptions, kind = kind, projectName = projectName, typeAcquisition = typeAcquisition, unresolvedImports = unresolvedImports)
    __obj.updateDynamic("typings")(typings_)
    __obj.asInstanceOf[SetTypings]
  }
}

