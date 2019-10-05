package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod

import org.scalablytyped.runtime.TopLevel
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.BindingName
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var index: js.UndefOr[Double | Null] = js.undefined
  var kind: js.UndefOr[String | Null] = js.undefined
  var name: BindingName
  var node: Node
  var parent: js.UndefOr[Node | Null] = js.undefined
  var rest: js.UndefOr[Boolean] = js.undefined
  var `type`: String
}

@JSImport("@typescript-eslint/experimental-utils/dist/ts-eslint-scope/Definition", "Definition")
@js.native
object Definition extends TopLevel[DefinitionConstructor]

