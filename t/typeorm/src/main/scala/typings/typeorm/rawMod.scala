package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import typings.typeorm.objectLiteralMod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/find-options/operator/Raw", JSImport.Namespace)
@js.native
object rawMod extends js.Object {
  
  def Raw[T](sqlGenerator: js.Function1[/* columnAlias */ String, String]): FindOperator[_] = js.native
  def Raw[T](sqlGenerator: js.Function1[/* columnAlias */ String, String], parameters: ObjectLiteral): FindOperator[_] = js.native
  def Raw[T](value: String): FindOperator[_] = js.native
}
