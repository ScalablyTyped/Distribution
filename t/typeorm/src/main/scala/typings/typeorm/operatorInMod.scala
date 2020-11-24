package typings.typeorm

import typings.typeorm.findOptionsFindOperatorMod.FindOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/find-options/operator/In", JSImport.Namespace)
@js.native
object operatorInMod extends js.Object {
  
  def In[T](value: js.Array[T]): FindOperator[T] = js.native
  def In[T](value: FindOperator[T]): FindOperator[T] = js.native
}
