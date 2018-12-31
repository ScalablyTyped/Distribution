package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typescriptLib.typescriptMod.tsNs.Declaration because Would inherit conflicting mutable fields List(decorators, end, flags, kind, modifiers, parent, pos))*/
@js.native
trait MappedTypeNode extends TypeNode {
  var questionToken: js.UndefOr[QuestionToken | PlusToken | MinusToken] = js.native
  var readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken] = js.native
  var `type`: js.UndefOr[TypeNode] = js.native
  var typeParameter: TypeParameterDeclaration = js.native
}

