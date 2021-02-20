package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import typings.typeorm.objectLiteralMod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawMod {
  
  @JSImport("typeorm/browser/find-options/operator/Raw", "Raw")
  @js.native
  def Raw[T](sqlGenerator: js.Function1[/* columnAlias */ String, String]): FindOperator[_] = js.native
  @JSImport("typeorm/browser/find-options/operator/Raw", "Raw")
  @js.native
  def Raw[T](sqlGenerator: js.Function1[/* columnAlias */ String, String], parameters: ObjectLiteral): FindOperator[_] = js.native
  @JSImport("typeorm/browser/find-options/operator/Raw", "Raw")
  @js.native
  def Raw[T](value: String): FindOperator[_] = js.native
}
