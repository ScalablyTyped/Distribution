package typings.typescript

import typings.typescript.typescriptMod.ConstructorDeclaration
import typings.typescript.typescriptMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: Identifier
  var parent: ConstructorDeclaration
}

object Anon_Name {
  @scala.inline
  def apply(name: Identifier, parent: ConstructorDeclaration): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Name]
  }
}

