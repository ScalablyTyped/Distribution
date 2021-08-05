package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moreThanMod {
  
  @JSImport("typeorm/browser/find-options/operator/MoreThan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MoreThan[T](value: T): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("MoreThan")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
  inline def MoreThan[T](value: FindOperator[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("MoreThan")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
}
