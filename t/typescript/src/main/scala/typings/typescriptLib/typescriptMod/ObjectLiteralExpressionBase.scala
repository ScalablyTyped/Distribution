package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is a base interface for ObjectLiteralExpression and JSXAttributes to extend from. JSXAttributes is similar to
  * ObjectLiteralExpression in that it contains array of properties; however, JSXAttributes' properties can only be
  * JSXAttribute or JSXSpreadAttribute. ObjectLiteralExpression, on the other hand, can only have properties of type
  * ObjectLiteralElement (e.g. PropertyAssignment, ShorthandPropertyAssignment etc.)
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait ObjectLiteralExpressionBase[T /* <: ObjectLiteralElement */] extends PrimaryExpression {
  var _declarationBrand: js.Any = js.native
  var properties: NodeArray[T] = js.native
}

