package typings.typeorm

import typings.typeorm.findOperatorMod.FindOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ilikeMod {
  
  @JSImport("typeorm/browser/find-options/operator/ILike", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ILike[T](value: T): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ILike")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
  inline def ILike[T](value: FindOperator[T]): FindOperator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ILike")(value.asInstanceOf[js.Any]).asInstanceOf[FindOperator[T]]
}
