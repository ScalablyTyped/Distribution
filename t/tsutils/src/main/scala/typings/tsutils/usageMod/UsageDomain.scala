package typings.tsutils.usageMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UsageDomain extends js.Object
@JSImport("tsutils/util/usage", "UsageDomain")
@js.native
object UsageDomain extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UsageDomain with Double] = js.native
  
  @js.native
  sealed trait Any extends UsageDomain
  /* 7 */ @js.native
  object Any extends TopLevel[Any with Double]
  
  @js.native
  sealed trait Namespace extends UsageDomain
  /* 1 */ @js.native
  object Namespace extends TopLevel[Namespace with Double]
  
  @js.native
  sealed trait Type extends UsageDomain
  /* 2 */ @js.native
  object Type extends TopLevel[Type with Double]
  
  @js.native
  sealed trait TypeQuery extends UsageDomain
  /* 8 */ @js.native
  object TypeQuery extends TopLevel[TypeQuery with Double]
  
  @js.native
  sealed trait Value extends UsageDomain
  /* 4 */ @js.native
  object Value extends TopLevel[Value with Double]
  
  @js.native
  sealed trait ValueOrNamespace extends UsageDomain
  /* 5 */ @js.native
  object ValueOrNamespace extends TopLevel[ValueOrNamespace with Double]
}
