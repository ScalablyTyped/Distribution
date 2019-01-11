package typings
package tsutilsLib.utilUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/usage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def collectVariableUsage(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile): stdLib.Map[typescriptLib.typescriptMod.tsNs.Identifier, tsutilsLib.utilUsageMod.VariableInfo] = js.native
  def getDeclarationDomain(node: typescriptLib.typescriptMod.tsNs.Identifier): js.UndefOr[tsutilsLib.utilUsageMod.DeclarationDomain] = js.native
  def getUsageDomain(node: typescriptLib.typescriptMod.tsNs.Identifier): js.UndefOr[tsutilsLib.utilUsageMod.UsageDomain] = js.native
}

