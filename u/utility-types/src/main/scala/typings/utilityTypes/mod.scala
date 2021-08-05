package typings.utilityTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("utility-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getReturnOfExpression[RT](expression: js.Function1[/* repeated */ js.Any, RT]): RT = ^.asInstanceOf[js.Dynamic].applyDynamic("getReturnOfExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[RT]
  
  inline def isFalsy(`val`: js.Any): /* is utility-types.utility-types/dist/aliases-and-guards.Falsy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalsy")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is utility-types.utility-types/dist/aliases-and-guards.Falsy */ Boolean]
  
  inline def isPrimitive(`val`: js.Any): /* is utility-types.utility-types/dist/aliases-and-guards.Primitive */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is utility-types.utility-types/dist/aliases-and-guards.Primitive */ Boolean]
}
