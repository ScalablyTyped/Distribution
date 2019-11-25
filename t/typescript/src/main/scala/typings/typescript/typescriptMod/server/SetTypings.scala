package typings.typescript.typescriptMod.server

import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.SortedReadonlyArray
import typings.typescript.typescriptMod.TypeAcquisition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTypings extends ProjectResponse {
  val compilerOptions: CompilerOptions
  @JSName("kind")
  val kind_SetTypings: ActionSet
  val typeAcquisition: TypeAcquisition
  @JSName("typings")
  val typings_ : js.Array[String]
  val unresolvedImports: SortedReadonlyArray[String]
}

object SetTypings {
  @scala.inline
  def apply(
    compilerOptions: CompilerOptions,
    kind: ActionSet,
    projectName: String,
    typeAcquisition: TypeAcquisition,
    typings_ : js.Array[String],
    unresolvedImports: SortedReadonlyArray[String]
  ): SetTypings = {
    val __obj = js.Dynamic.literal(compilerOptions = compilerOptions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], typeAcquisition = typeAcquisition.asInstanceOf[js.Any], unresolvedImports = unresolvedImports.asInstanceOf[js.Any])
    __obj.updateDynamic("typings")(typings_.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTypings]
  }
}

