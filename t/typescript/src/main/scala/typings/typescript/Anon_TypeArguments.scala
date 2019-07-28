package typings.typescript

import typings.typescript.typescriptMod.NodeArray
import typings.typescript.typescriptMod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeArguments extends js.Object {
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.undefined
}

object Anon_TypeArguments {
  @scala.inline
  def apply(typeArguments: NodeArray[TypeNode] = null): Anon_TypeArguments = {
    val __obj = js.Dynamic.literal()
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments)
    __obj.asInstanceOf[Anon_TypeArguments]
  }
}

