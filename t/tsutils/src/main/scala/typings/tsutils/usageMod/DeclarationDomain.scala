package typings.tsutils.usageMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeclarationDomain with Double] = js.native
  /* 7 */ @js.native
  object Any extends TopLevel[Any with Double]
  
  /* 8 */ @js.native
  object Import extends TopLevel[Import with Double]
  
  /* 1 */ @js.native
  object Namespace extends TopLevel[Namespace with Double]
  
  /* 2 */ @js.native
  object Type extends TopLevel[Type with Double]
  
  /* 4 */ @js.native
  object Value extends TopLevel[Value with Double]
  
}

