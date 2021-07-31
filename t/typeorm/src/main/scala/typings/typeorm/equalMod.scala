package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalMod {
  
  @JSImport("typeorm/browser/find-options/operator/Equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Equal[T](value: T): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Equal")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
  @scala.inline
  def Equal[T](value: FindOperator[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Equal")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
}
