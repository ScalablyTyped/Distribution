package typings.typeorm

import typings.typeorm.findOptionsFindOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMoreThanMod {
  
  @JSImport("typeorm/find-options/operator/MoreThan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def MoreThan[T](value: T): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("MoreThan")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
  @scala.inline
  def MoreThan[T](value: FindOperator[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("MoreThan")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
}
