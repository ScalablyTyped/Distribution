package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait ObjectLiteralExpressionBase[T /* <: ObjectLiteralElement */] extends PrimaryExpression {
  var _declarationBrand: js.Any = js.native
  var properties: NodeArray[T] = js.native
}

