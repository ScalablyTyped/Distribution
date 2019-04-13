package typings
package typescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: typescriptLib.typescriptMod.Identifier
  var parent: typescriptLib.typescriptMod.ConstructorDeclaration
}

object Anon_Name {
  @scala.inline
  def apply(
    name: typescriptLib.typescriptMod.Identifier,
    parent: typescriptLib.typescriptMod.ConstructorDeclaration
  ): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, parent = parent)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

