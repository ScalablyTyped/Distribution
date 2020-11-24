package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/find-options/operator/In", JSImport.Namespace)
@js.native
object inMod extends js.Object {
  
  def In[T](value: js.Array[T]): FindOperator[T] = js.native
  def In[T](value: FindOperator[T]): FindOperator[T] = js.native
}
