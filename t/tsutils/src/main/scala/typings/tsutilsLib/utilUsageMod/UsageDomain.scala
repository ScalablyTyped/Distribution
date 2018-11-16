package typings
package tsutilsLib.utilUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UsageDomain extends js.Object

@JSImport("tsutils/util/usage", "UsageDomain")
@js.native
object UsageDomain extends js.Object {
  @js.native
  sealed trait Any
    extends tsutilsLib.utilUsageMod.UsageDomain
  
  @js.native
  sealed trait Namespace
    extends tsutilsLib.utilUsageMod.UsageDomain
  
  @js.native
  sealed trait Type
    extends tsutilsLib.utilUsageMod.UsageDomain
  
  @js.native
  sealed trait TypeQuery
    extends tsutilsLib.utilUsageMod.UsageDomain
  
  @js.native
  sealed trait Value
    extends tsutilsLib.utilUsageMod.UsageDomain
  
  @js.native
  sealed trait ValueOrNamespace
    extends tsutilsLib.utilUsageMod.UsageDomain
  
  /* 7 */ val Any: Any with scala.Double = js.native
  /* 1 */ val Namespace: Namespace with scala.Double = js.native
  /* 2 */ val Type: Type with scala.Double = js.native
  /* 8 */ val TypeQuery: TypeQuery with scala.Double = js.native
  /* 4 */ val Value: Value with scala.Double = js.native
  /* 5 */ val ValueOrNamespace: ValueOrNamespace with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[tsutilsLib.utilUsageMod.UsageDomain with scala.Double] = js.native
}

