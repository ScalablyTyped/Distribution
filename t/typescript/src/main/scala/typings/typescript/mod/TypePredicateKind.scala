package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypePredicateKind extends js.Object
@JSImport("typescript", "TypePredicateKind")
@js.native
object TypePredicateKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypePredicateKind with Double] = js.native
  
  @js.native
  sealed trait AssertsIdentifier extends TypePredicateKind
  /* 3 */ @js.native
  object AssertsIdentifier extends TopLevel[AssertsIdentifier with Double]
  
  @js.native
  sealed trait AssertsThis extends TypePredicateKind
  /* 2 */ @js.native
  object AssertsThis extends TopLevel[AssertsThis with Double]
  
  @js.native
  sealed trait Identifier extends TypePredicateKind
  /* 1 */ @js.native
  object Identifier
    extends TopLevel[typings.typescript.mod.TypePredicateKind.Identifier with Double]
  
  @js.native
  sealed trait This extends TypePredicateKind
  /* 0 */ @js.native
  object This extends TopLevel[This with Double]
}
