package typings
package typescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeArguments extends js.Object {
  var typeArguments: js.UndefOr[typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeNode]] = js.undefined
}

object Anon_TypeArguments {
  @scala.inline
  def apply(typeArguments: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeNode] = null): Anon_TypeArguments = {
    val __obj = js.Dynamic.literal()
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments)
    __obj.asInstanceOf[Anon_TypeArguments]
  }
}

