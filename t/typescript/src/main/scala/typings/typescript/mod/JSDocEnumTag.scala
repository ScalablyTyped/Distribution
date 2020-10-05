package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait JSDocEnumTag extends JSDocTag {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_JSDocEnumTag: typings.typescript.mod.SyntaxKind.JSDocEnumTag = js.native
  @JSName("parent")
  var parent_JSDocEnumTag: JSDoc = js.native
  var typeExpression: js.UndefOr[JSDocTypeExpression] = js.native
}

