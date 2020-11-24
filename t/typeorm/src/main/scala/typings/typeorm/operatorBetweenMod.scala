package typings.typeorm

import typings.typeorm.findOptionsFindOperatorMod.FindOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/find-options/operator/Between", JSImport.Namespace)
@js.native
object operatorBetweenMod extends js.Object {
  
  def Between[T](from: T, to: T): FindOperator[T] = js.native
  def Between[T](from: T, to: FindOperator[T]): FindOperator[T] = js.native
  def Between[T](from: FindOperator[T], to: T): FindOperator[T] = js.native
  def Between[T](from: FindOperator[T], to: FindOperator[T]): FindOperator[T] = js.native
}
