package typings.typeorm

import typings.typeorm.findOptionsFindOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorIlikeMod {
  
  @JSImport("typeorm/find-options/operator/ILike", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ILike[T](value: T): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ILike")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
  @scala.inline
  def ILike[T](value: FindOperator[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ILike")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
}
