package typings
package typescriptLib.typescriptMod.tsNs.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTypings extends ProjectResponse {
  val compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions
  @JSName("kind")
  val kind_SetTypings: ActionSet
  val typeAcquisition: typescriptLib.typescriptMod.tsNs.TypeAcquisition
  @JSName("typings")
  val `typings_`: js.Array[java.lang.String]
  val unresolvedImports: typescriptLib.typescriptMod.tsNs.SortedReadonlyArray[java.lang.String]
}

object SetTypings {
  @scala.inline
  def apply(
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    kind: ActionSet,
    projectName: java.lang.String,
    typeAcquisition: typescriptLib.typescriptMod.tsNs.TypeAcquisition,
    `typings_`: js.Array[java.lang.String],
    unresolvedImports: typescriptLib.typescriptMod.tsNs.SortedReadonlyArray[java.lang.String]
  ): SetTypings = {
    val __obj = js.Dynamic.literal(`typings_` = `typings_`)
    __obj.updateDynamic("compilerOptions")(compilerOptions)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("projectName")(projectName)
    __obj.updateDynamic("typeAcquisition")(typeAcquisition)
    __obj.updateDynamic("unresolvedImports")(unresolvedImports)
    __obj.asInstanceOf[SetTypings]
  }
}

