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

