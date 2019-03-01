package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.tsNs.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait MappedTypeNode
  extends TypeNode
     with HasType {
  var _declarationBrand: js.Any = js.native
  var questionToken: js.UndefOr[QuestionToken | PlusToken | MinusToken] = js.native
  var readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken] = js.native
  var `type`: js.UndefOr[TypeNode] = js.native
  var typeParameter: TypeParameterDeclaration = js.native
}

