package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import typings.typeorm.objectLiteralMod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawMod {
  
  @JSImport("typeorm/browser/find-options/operator/Raw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Raw[T](sqlGenerator: js.Function1[/* columnAlias */ String, String]): FindOperator[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Raw")(sqlGenerator.asInstanceOf[js.Any]).asInstanceOf[FindOperator[js.Any]]
  inline def Raw[T](sqlGenerator: js.Function1[/* columnAlias */ String, String], parameters: ObjectLiteral): FindOperator[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Raw")(sqlGenerator.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[FindOperator[js.Any]]
  inline def Raw[T](value: String): FindOperator[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Raw")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[js.Any]]
}
