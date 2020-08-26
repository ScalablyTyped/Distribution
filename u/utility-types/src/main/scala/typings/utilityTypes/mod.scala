package typings.utilityTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility-types", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getReturnOfExpression[RT](expression: js.Function1[/* repeated */ js.Any, RT]): RT = js.native
  def isFalsy(`val`: js.Any): /* is utility-types.utility-types/dist/aliases-and-guards.Falsy */ Boolean = js.native
  def isPrimitive(`val`: js.Any): /* is utility-types.utility-types/dist/aliases-and-guards.Primitive */ Boolean = js.native
}

