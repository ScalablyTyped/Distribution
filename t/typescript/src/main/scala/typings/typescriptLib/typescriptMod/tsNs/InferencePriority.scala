package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InferencePriority extends js.Object

@JSImport("typescript/ts", "InferencePriority")
@js.native
object InferencePriority extends js.Object {
  @js.native
  sealed trait AlwaysStrict
    extends typescriptLib.typescriptMod.tsNs.InferencePriority
  
  @js.native
  sealed trait HomomorphicMappedType
    extends typescriptLib.typescriptMod.tsNs.InferencePriority
  
  @js.native
  sealed trait LiteralKeyof
    extends typescriptLib.typescriptMod.tsNs.InferencePriority
  
  @js.native
  sealed trait MappedTypeConstraint
    extends typescriptLib.typescriptMod.tsNs.InferencePriority
  
  @js.native
  sealed trait NakedTypeVariable
    extends typescriptLib.typescriptMod.tsNs.InferencePriority
  
  @js.native
  sealed trait NoConstraints
    extends typescriptLib.typescriptMod.tsNs.InferencePriority
  
  @js.native
  sealed trait PriorityImpliesCombination
    extends typescriptLib.typescriptMod.tsNs.InferencePriority
  
  @js.native
  sealed trait ReturnType
    extends typescriptLib.typescriptMod.tsNs.InferencePriority
  
}

