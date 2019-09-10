package typings.tsutils.utilUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeclarationDomain extends js.Object

@JSImport("tsutils/util/usage", "DeclarationDomain")
@js.native
object DeclarationDomain extends js.Object {
  @js.native
  sealed trait Any extends DeclarationDomain
  
  @js.native
  sealed trait Import extends DeclarationDomain
  
  @js.native
  sealed trait Namespace extends DeclarationDomain
  
  @js.native
  sealed trait Type extends DeclarationDomain
  
  @js.native
  sealed trait Value extends DeclarationDomain
  
  /* 7 */ val Any: typings.tsutils.utilUsageMod.DeclarationDomain.Any with Double = js.native
  /* 8 */ val Import: typings.tsutils.utilUsageMod.DeclarationDomain.Import with Double = js.native
  /* 1 */ val Namespace: typings.tsutils.utilUsageMod.DeclarationDomain.Namespace with Double = js.native
  /* 2 */ val Type: typings.tsutils.utilUsageMod.DeclarationDomain.Type with Double = js.native
  /* 4 */ val Value: typings.tsutils.utilUsageMod.DeclarationDomain.Value with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeclarationDomain with Double] = js.native
}

