package typings.tsutils.utilUsageMod

import typings.std.Map
import typings.typescript.typescriptMod.Identifier
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/usage", "collectVariableUsage")
@js.native
object collectVariableUsage extends js.Object {
  def apply(sourceFile: SourceFile): Map[Identifier, VariableInfo] = js.native
}

