package typings.typeorm

import typings.typeorm.findOptionsFindOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorNotMod {
  
  @JSImport("typeorm/find-options/operator/Not", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Not[T](value: T): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Not")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
  @scala.inline
  def Not[T](value: FindOperator[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Not")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
}
