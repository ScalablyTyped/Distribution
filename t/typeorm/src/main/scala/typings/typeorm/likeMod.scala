package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object likeMod {
  
  @JSImport("typeorm/browser/find-options/operator/Like", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Like[T](value: T): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Like")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
  inline def Like[T](value: FindOperator[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Like")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
}
