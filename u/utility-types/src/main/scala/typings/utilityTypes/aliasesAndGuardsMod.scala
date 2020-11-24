package typings.utilityTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("utility-types/dist/aliases-and-guards", JSImport.Namespace)
@js.native
object aliasesAndGuardsMod extends js.Object {
  
  def isFalsy(`val`: js.Any): /* is utility-types.utility-types/dist/aliases-and-guards.Falsy */ Boolean = js.native
  
  def isPrimitive(`val`: js.Any): /* is utility-types.utility-types/dist/aliases-and-guards.Primitive */ Boolean = js.native
  
  trait _Falsy extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.utilityTypes.utilityTypesBooleans.`false`
    - typings.utilityTypes.utilityTypesStrings._empty
    - typings.utilityTypes.utilityTypesNumbers.`0`
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  
  type Primitive = js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null]
}
