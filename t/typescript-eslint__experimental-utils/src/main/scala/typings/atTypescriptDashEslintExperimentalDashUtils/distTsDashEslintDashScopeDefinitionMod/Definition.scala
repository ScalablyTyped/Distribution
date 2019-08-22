package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod

import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.BindingName
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.PropertyName
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
class DefinitionCls protected () extends Definition {
  def this(`type`: String, name: BindingName, node: Node) = this()
  def this(`type`: String, name: PropertyName, node: Node) = this()
  def this(`type`: String, name: BindingName, node: Node, parent: Node) = this()
  def this(`type`: String, name: PropertyName, node: Node, parent: Node) = this()
  def this(`type`: String, name: BindingName, node: Node, parent: Null, index: Double) = this()
  def this(`type`: String, name: BindingName, node: Node, parent: Node, index: Double) = this()
  def this(`type`: String, name: PropertyName, node: Node, parent: Null, index: Double) = this()
  def this(`type`: String, name: PropertyName, node: Node, parent: Node, index: Double) = this()
  def this(`type`: String, name: BindingName, node: Node, parent: Null, index: Double, kind: String) = this()
  def this(`type`: String, name: BindingName, node: Node, parent: Null, index: Null, kind: String) = this()
  def this(`type`: String, name: BindingName, node: Node, parent: Node, index: Double, kind: String) = this()
  def this(`type`: String, name: BindingName, node: Node, parent: Node, index: Null, kind: String) = this()
  def this(`type`: String, name: PropertyName, node: Node, parent: Null, index: Double, kind: String) = this()
  def this(`type`: String, name: PropertyName, node: Node, parent: Null, index: Null, kind: String) = this()
  def this(`type`: String, name: PropertyName, node: Node, parent: Node, index: Double, kind: String) = this()
  def this(`type`: String, name: PropertyName, node: Node, parent: Node, index: Null, kind: String) = this()
  /* CompleteClass */
  override var name: BindingName = js.native
  /* CompleteClass */
  override var node: Node = js.native
  /* CompleteClass */
  override var `type`: String = js.native
}

object Definition {
  @scala.inline
  def apply(
    name: BindingName,
    node: Node,
    `type`: String,
    index: Int | Double = null,
    kind: String = null,
    parent: Node = null,
    rest: js.UndefOr[Boolean] = js.undefined
  ): Definition = {
    val __obj = js.Dynamic.literal(name = name, node = node)
    __obj.updateDynamic("type")(`type`)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(rest)) __obj.updateDynamic("rest")(rest)
    __obj.asInstanceOf[Definition]
  }
}

