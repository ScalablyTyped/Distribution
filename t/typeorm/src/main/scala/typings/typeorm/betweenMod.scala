package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/find-options/operator/Between", JSImport.Namespace)
@js.native
object betweenMod extends js.Object {
  
  def Between[T](from: T, to: T): FindOperator[T] = js.native
  def Between[T](from: T, to: FindOperator[T]): FindOperator[T] = js.native
  def Between[T](from: FindOperator[T], to: T): FindOperator[T] = js.native
  def Between[T](from: FindOperator[T], to: FindOperator[T]): FindOperator[T] = js.native
}
