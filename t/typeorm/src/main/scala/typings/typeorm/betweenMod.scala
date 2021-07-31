package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object betweenMod {
  
  @JSImport("typeorm/browser/find-options/operator/Between", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Between[T](from: T, to: T): FindOperator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Between")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[FindOperator[T]]
  @scala.inline
  def Between[T](from: T, to: FindOperator[T]): FindOperator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Between")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[FindOperator[T]]
  @scala.inline
  def Between[T](from: FindOperator[T], to: T): FindOperator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Between")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[FindOperator[T]]
  @scala.inline
  def Between[T](from: FindOperator[T], to: FindOperator[T]): FindOperator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Between")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[FindOperator[T]]
}
