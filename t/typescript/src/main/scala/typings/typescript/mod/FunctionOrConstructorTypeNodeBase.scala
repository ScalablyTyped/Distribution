package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.ConstructorType
import typings.typescript.mod.SyntaxKind.FunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand */ @js.native
trait FunctionOrConstructorTypeNodeBase extends SignatureDeclarationBase {
  var _typeNodeBrand: js.Any = js.native
  @JSName("kind")
  var kind_FunctionOrConstructorTypeNodeBase: FunctionType | ConstructorType = js.native
  @JSName("type")
  var type_FunctionOrConstructorTypeNodeBase: TypeNode = js.native
}

