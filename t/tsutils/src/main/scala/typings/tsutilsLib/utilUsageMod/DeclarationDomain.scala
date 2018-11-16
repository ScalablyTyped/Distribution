package typings
package tsutilsLib.utilUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeclarationDomain extends js.Object

@JSImport("tsutils/util/usage", "DeclarationDomain")
@js.native
object DeclarationDomain extends js.Object {
  @js.native
  sealed trait Any
    extends tsutilsLib.utilUsageMod.DeclarationDomain
  
  @js.native
  sealed trait Import
    extends tsutilsLib.utilUsageMod.DeclarationDomain
  
  @js.native
  sealed trait Namespace
    extends tsutilsLib.utilUsageMod.DeclarationDomain
  
  @js.native
  sealed trait Type
    extends tsutilsLib.utilUsageMod.DeclarationDomain
  
  @js.native
  sealed trait Value
    extends tsutilsLib.utilUsageMod.DeclarationDomain
  
  /* 7 */ val Any: Any with scala.Double = js.native
  /* 8 */ val Import: Import with scala.Double = js.native
  /* 1 */ val Namespace: Namespace with scala.Double = js.native
  /* 2 */ val Type: Type with scala.Double = js.native
  /* 4 */ val Value: Value with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[tsutilsLib.utilUsageMod.DeclarationDomain with scala.Double] = js.native
}

