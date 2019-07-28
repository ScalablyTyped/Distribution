package typings.typescript.typescriptMod

import typings.typescript.typescriptMod.SyntaxKind.TypeLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait TypeLiteralNode
  extends TypeNode
     with ObjectTypeDeclaration {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_TypeLiteralNode: TypeLiteral = js.native
  var members: NodeArray[TypeElement] = js.native
}

