package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This interface is a base interface for ObjectLiteralExpression and JSXAttributes to extend from. JSXAttributes is similar to
     * ObjectLiteralExpression in that it contains array of properties; however, JSXAttributes' properties can only be
     * JSXAttribute or JSXSpreadAttribute. ObjectLiteralExpression, on the other hand, can only have properties of type
     * ObjectLiteralElement (e.g. PropertyAssignment, ShorthandPropertyAssignment etc.)
     */
/* RemoveMultipleInheritance: Dropped parents List(typescriptLib.typescriptMod.tsNs.Declaration because Would inherit conflicting mutable fields List(pos, end, parent, flags, decorators, modifiers, kind))*/
@js.native
trait ObjectLiteralExpressionBase[T /* <: ObjectLiteralElement */] extends PrimaryExpression {
  var properties: NodeArray[T] = js.native
}

