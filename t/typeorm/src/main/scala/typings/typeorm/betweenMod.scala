package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object betweenMod {
  
  @JSImport("typeorm/browser/find-options/operator/Between", "Between")
  @js.native
  def Between[T](from: T, to: T): FindOperator[T] = js.native
  @JSImport("typeorm/browser/find-options/operator/Between", "Between")
  @js.native
  def Between[T](from: T, to: FindOperator[T]): FindOperator[T] = js.native
  @JSImport("typeorm/browser/find-options/operator/Between", "Between")
  @js.native
  def Between[T](from: FindOperator[T], to: T): FindOperator[T] = js.native
  @JSImport("typeorm/browser/find-options/operator/Between", "Between")
  @js.native
  def Between[T](from: FindOperator[T], to: FindOperator[T]): FindOperator[T] = js.native
}
