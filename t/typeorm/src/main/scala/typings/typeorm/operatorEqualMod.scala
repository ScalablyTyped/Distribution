package typings.typeorm

import typings.typeorm.findOptionsFindOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorEqualMod {
  
  @JSImport("typeorm/find-options/operator/Equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Equal[T](value: T): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Equal")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
  inline def Equal[T](value: FindOperator[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Equal")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
}
