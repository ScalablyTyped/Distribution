package typings.typeorm

import typings.typeorm.findOptionsFindOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorInMod {
  
  @JSImport("typeorm/find-options/operator/In", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def In[T](value: js.Array[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("In")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
  inline def In[T](value: FindOperator[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("In")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
}
