package typings.utilityTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliasesAndGuardsMod {
  
  @JSImport("utility-types/dist/aliases-and-guards", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isFalsy(`val`: js.Any): /* is utility-types.utility-types/dist/aliases-and-guards.Falsy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalsy")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is utility-types.utility-types/dist/aliases-and-guards.Falsy */ Boolean]
  
  inline def isPrimitive(`val`: js.Any): /* is utility-types.utility-types/dist/aliases-and-guards.Primitive */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is utility-types.utility-types/dist/aliases-and-guards.Primitive */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.utilityTypes.utilityTypesBooleans.`false`
    - typings.utilityTypes.utilityTypesStrings._empty
    - typings.utilityTypes.utilityTypesNumbers.`0`
    - scala.Null
    - scala.Unit
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  
  type Primitive = js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null]
  
  trait _Falsy extends StObject
}
