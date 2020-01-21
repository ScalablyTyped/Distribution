package typings.typescript

import typings.typescript.mod.NodeArray
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeArguments extends js.Object {
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.undefined
}

object AnonTypeArguments {
  @scala.inline
  def apply(typeArguments: NodeArray[TypeNode] = null): AnonTypeArguments = {
    val __obj = js.Dynamic.literal()
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeArguments]
  }
}

