package typings
package typescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: typescriptLib.typescriptMod.tsNs.Identifier
  var parent: typescriptLib.typescriptMod.tsNs.ConstructorDeclaration
}

object Anon_Name {
  @scala.inline
  def apply(
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    parent: typescriptLib.typescriptMod.tsNs.ConstructorDeclaration
  ): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_Name]
  }
}

