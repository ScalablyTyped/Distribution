package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand */ @js.native
trait FunctionOrConstructorTypeNodeBase extends SignatureDeclarationBase {
  var _typeNodeBrand: js.Any = js.native
  @JSName("kind")
  var kind_FunctionOrConstructorTypeNodeBase: typescriptLib.typescriptMod.SyntaxKind.FunctionType | typescriptLib.typescriptMod.SyntaxKind.ConstructorType = js.native
  @JSName("type")
  var type_FunctionOrConstructorTypeNodeBase: TypeNode = js.native
}

