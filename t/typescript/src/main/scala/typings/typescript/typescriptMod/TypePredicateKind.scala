package typings.typescript.typescriptMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypePredicateKind extends js.Object

@JSImport("typescript", "TypePredicateKind")
@js.native
object TypePredicateKind extends js.Object {
  @js.native
  sealed trait AssertsIdentifier extends TypePredicateKind
  
  @js.native
  sealed trait AssertsThis extends TypePredicateKind
  
  @js.native
  sealed trait Identifier extends TypePredicateKind
  
  @js.native
  sealed trait This extends TypePredicateKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypePredicateKind with Double] = js.native
  /* 3 */ @js.native
  object AssertsIdentifier extends TopLevel[AssertsIdentifier with Double]
  
  /* 2 */ @js.native
  object AssertsThis extends TopLevel[AssertsThis with Double]
  
  /* 1 */ @js.native
  object Identifier
    extends TopLevel[typings.typescript.typescriptMod.TypePredicateKind.Identifier with Double]
  
  /* 0 */ @js.native
  object This extends TopLevel[This with Double]
  
}

