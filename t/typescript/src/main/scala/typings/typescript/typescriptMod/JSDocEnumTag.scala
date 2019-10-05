package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescript.typescriptMod.TextRange because Already inherited
- typings.typescript.typescriptMod.Node because Already inherited
- typings.typescript.typescriptMod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait JSDocEnumTag extends JSDocTag {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_JSDocEnumTag: typings.typescript.typescriptMod.SyntaxKind.JSDocEnumTag = js.native
  @JSName("parent")
  var parent_JSDocEnumTag: JSDoc = js.native
  var typeExpression: js.UndefOr[JSDocTypeExpression] = js.native
}

