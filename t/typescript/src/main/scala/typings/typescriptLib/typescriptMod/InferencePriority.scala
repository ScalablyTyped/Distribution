package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InferencePriority extends js.Object

@JSImport("typescript", "InferencePriority")
@js.native
object InferencePriority extends js.Object {
  @js.native
  sealed trait AlwaysStrict
    extends typescriptLib.typescriptMod.InferencePriority
  
  @js.native
  sealed trait HomomorphicMappedType
    extends typescriptLib.typescriptMod.InferencePriority
  
  @js.native
  sealed trait LiteralKeyof
    extends typescriptLib.typescriptMod.InferencePriority
  
  @js.native
  sealed trait MappedTypeConstraint
    extends typescriptLib.typescriptMod.InferencePriority
  
  @js.native
  sealed trait NakedTypeVariable
    extends typescriptLib.typescriptMod.InferencePriority
  
  @js.native
  sealed trait NoConstraints
    extends typescriptLib.typescriptMod.InferencePriority
  
  @js.native
  sealed trait PriorityImpliesCombination
    extends typescriptLib.typescriptMod.InferencePriority
  
  @js.native
  sealed trait ReturnType
    extends typescriptLib.typescriptMod.InferencePriority
  
  /* 64 */ val AlwaysStrict: AlwaysStrict with scala.Double = js.native
  /* 2 */ val HomomorphicMappedType: HomomorphicMappedType with scala.Double = js.native
  /* 16 */ val LiteralKeyof: LiteralKeyof with scala.Double = js.native
  /* 4 */ val MappedTypeConstraint: MappedTypeConstraint with scala.Double = js.native
  /* 1 */ val NakedTypeVariable: NakedTypeVariable with scala.Double = js.native
  /* 32 */ val NoConstraints: NoConstraints with scala.Double = js.native
  /* 28 */ val PriorityImpliesCombination: PriorityImpliesCombination with scala.Double = js.native
  /* 8 */ val ReturnType: ReturnType with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.InferencePriority with scala.Double] = js.native
}

