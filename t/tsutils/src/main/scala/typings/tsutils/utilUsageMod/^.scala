package typings.tsutils.utilUsageMod

import typings.std.Map
import typings.typescript.typescriptMod.Identifier
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/usage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def collectVariableUsage(sourceFile: SourceFile): Map[Identifier, VariableInfo] = js.native
  def getDeclarationDomain(node: Identifier): js.UndefOr[DeclarationDomain] = js.native
  def getUsageDomain(node: Identifier): js.UndefOr[UsageDomain] = js.native
}

