package typings.typescript

import typings.typescript.mod.ConstructorDeclaration
import typings.typescript.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: Identifier
  var parent: ConstructorDeclaration
}

object AnonName {
  @scala.inline
  def apply(name: Identifier, parent: ConstructorDeclaration): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

