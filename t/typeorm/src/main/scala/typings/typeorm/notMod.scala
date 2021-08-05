package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notMod {
  
  @JSImport("typeorm/browser/find-options/operator/Not", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Not[T](value: T): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Not")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
  inline def Not[T](value: FindOperator[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Not")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
}
