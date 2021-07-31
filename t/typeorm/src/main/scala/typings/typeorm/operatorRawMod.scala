package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.findOptionsFindOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorRawMod {
  
  @JSImport("typeorm/find-options/operator/Raw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Raw[T](sqlGenerator: js.Function1[/* columnAlias */ String, String]): FindOperator[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Raw")(sqlGenerator.asInstanceOf[js.Any]).asInstanceOf[FindOperator[js.Any]]
  @scala.inline
  def Raw[T](sqlGenerator: js.Function1[/* columnAlias */ String, String], parameters: ObjectLiteral): FindOperator[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Raw")(sqlGenerator.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[FindOperator[js.Any]]
  @scala.inline
  def Raw[T](value: String): FindOperator[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Raw")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[js.Any]]
}
