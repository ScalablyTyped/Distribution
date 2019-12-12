package typings.tsutils.utilUsageMod

import org.scalablytyped.runtime.TopLevel
import typings.tsutils.utilUsageMod.UsageDomain.Any
import typings.tsutils.utilUsageMod.UsageDomain.Namespace
import typings.tsutils.utilUsageMod.UsageDomain.Type
import typings.tsutils.utilUsageMod.UsageDomain.TypeQuery
import typings.tsutils.utilUsageMod.UsageDomain.Value
import typings.tsutils.utilUsageMod.UsageDomain.ValueOrNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UsageDomain extends js.Object

@JSImport("tsutils/util/usage", "UsageDomain")
@js.native
object UsageDomain extends js.Object {
  @js.native
  sealed trait Any extends UsageDomain
  
  @js.native
  sealed trait Namespace extends UsageDomain
  
  @js.native
  sealed trait Type extends UsageDomain
  
  @js.native
  sealed trait TypeQuery extends UsageDomain
  
  @js.native
  sealed trait Value extends UsageDomain
  
  @js.native
  sealed trait ValueOrNamespace extends UsageDomain
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UsageDomain with Double] = js.native
  /* 7 */ @js.native
  object Any extends TopLevel[Any with Double]
  
  /* 1 */ @js.native
  object Namespace extends TopLevel[Namespace with Double]
  
  /* 2 */ @js.native
  object Type extends TopLevel[Type with Double]
  
  /* 8 */ @js.native
  object TypeQuery extends TopLevel[TypeQuery with Double]
  
  /* 4 */ @js.native
  object Value extends TopLevel[Value with Double]
  
  /* 5 */ @js.native
  object ValueOrNamespace extends TopLevel[ValueOrNamespace with Double]
  
}

