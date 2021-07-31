package typings.typeorm

import typings.typeorm.findOptionsFindOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorLikeMod {
  
  @JSImport("typeorm/find-options/operator/Like", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Like[T](value: T): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Like")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
  @scala.inline
  def Like[T](value: FindOperator[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Like")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
}
