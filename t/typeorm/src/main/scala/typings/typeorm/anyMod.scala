package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anyMod {
  
  @JSImport("typeorm/browser/find-options/operator/Any", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Any[T](value: js.Array[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Any")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
  @scala.inline
  def Any[T](value: FindOperator[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Any")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
}
