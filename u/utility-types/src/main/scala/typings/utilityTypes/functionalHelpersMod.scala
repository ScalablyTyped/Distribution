package typings.utilityTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionalHelpersMod {
  
  @JSImport("utility-types/dist/functional-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getReturnOfExpression[RT](expression: js.Function1[/* repeated */ js.Any, RT]): RT = ^.asInstanceOf[js.Dynamic].applyDynamic("getReturnOfExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[RT]
}
