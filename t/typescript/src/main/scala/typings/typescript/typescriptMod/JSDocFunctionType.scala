package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand
- typings.typescript.typescriptMod.JSDocType because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _jsDocTypeBrand */ @js.native
trait JSDocFunctionType
  extends SignatureDeclarationBase
     with SignatureDeclaration
     with _HasJSDoc {
  var _jsDocTypeBrand: js.Any = js.native
  var _typeNodeBrand: js.Any = js.native
  @JSName("kind")
  var kind_JSDocFunctionType: typings.typescript.typescriptMod.SyntaxKind.JSDocFunctionType = js.native
}

