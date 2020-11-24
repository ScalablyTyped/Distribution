package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.findOptionsFindOperatorMod.FindOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/find-options/operator/Raw", JSImport.Namespace)
@js.native
object operatorRawMod extends js.Object {
  
  def Raw[T](sqlGenerator: js.Function1[/* columnAlias */ String, String]): FindOperator[_] = js.native
  def Raw[T](sqlGenerator: js.Function1[/* columnAlias */ String, String], parameters: ObjectLiteral): FindOperator[_] = js.native
  def Raw[T](value: String): FindOperator[_] = js.native
}
