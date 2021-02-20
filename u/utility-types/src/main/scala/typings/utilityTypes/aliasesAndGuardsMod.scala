package typings.utilityTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliasesAndGuardsMod {
  
  @JSImport("utility-types/dist/aliases-and-guards", "isFalsy")
  @js.native
  def isFalsy(`val`: js.Any): /* is utility-types.utility-types/dist/aliases-and-guards.Falsy */ Boolean = js.native
  
  @JSImport("utility-types/dist/aliases-and-guards", "isPrimitive")
  @js.native
  def isPrimitive(`val`: js.Any): /* is utility-types.utility-types/dist/aliases-and-guards.Primitive */ Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.utilityTypes.utilityTypesBooleans.`false`
    - typings.utilityTypes.utilityTypesStrings._empty
    - typings.utilityTypes.utilityTypesNumbers.`0`
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  
  type Primitive = js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null]
  
  trait _Falsy extends StObject
}
