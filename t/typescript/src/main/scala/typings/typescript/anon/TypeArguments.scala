package typings.typescript.anon

import typings.typescript.mod.NodeArray
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeArguments extends js.Object {
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.undefined
}

object TypeArguments {
  @scala.inline
  def apply(typeArguments: NodeArray[TypeNode] = null): TypeArguments = {
    val __obj = js.Dynamic.literal()
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeArguments]
  }
}

