package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lessThanMod {
  
  @JSImport("typeorm/browser/find-options/operator/LessThan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LessThan[T](value: T): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("LessThan")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
  inline def LessThan[T](value: FindOperator[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("LessThan")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
}
