package typings.typeorm.mod

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Raw")
@js.native
object Raw extends js.Object {
  
  def apply[T](sqlGenerator: js.Function1[/* columnAlias */ String, String]): typings.typeorm.findOptionsFindOperatorMod.FindOperator[_] = js.native
  def apply[T](sqlGenerator: js.Function1[/* columnAlias */ String, String], parameters: ObjectLiteral): typings.typeorm.findOptionsFindOperatorMod.FindOperator[_] = js.native
  def apply[T](value: String): typings.typeorm.findOptionsFindOperatorMod.FindOperator[_] = js.native
}
