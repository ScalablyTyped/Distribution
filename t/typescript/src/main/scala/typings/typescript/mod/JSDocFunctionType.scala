package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.TypeNode because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _typeNodeBrand
- typings.typescript.mod.JSDocType because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _jsDocTypeBrand */ @js.native
trait JSDocFunctionType
  extends SignatureDeclarationBase
     with SignatureDeclaration
     with _HasJSDoc {
  var _jsDocTypeBrand: js.Any = js.native
  var _typeNodeBrand: js.Any = js.native
  @JSName("kind")
  var kind_JSDocFunctionType: typings.typescript.mod.SyntaxKind.JSDocFunctionType = js.native
}

