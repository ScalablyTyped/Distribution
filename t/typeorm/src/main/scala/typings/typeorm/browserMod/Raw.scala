package typings.typeorm.browserMod

import typings.typeorm.objectLiteralMod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Raw")
@js.native
object Raw extends js.Object {
  
  def apply[T](sqlGenerator: js.Function1[/* columnAlias */ String, String]): typings.typeorm.findOperatorMod.FindOperator[_] = js.native
  def apply[T](sqlGenerator: js.Function1[/* columnAlias */ String, String], parameters: ObjectLiteral): typings.typeorm.findOperatorMod.FindOperator[_] = js.native
  def apply[T](value: String): typings.typeorm.findOperatorMod.FindOperator[_] = js.native
}
