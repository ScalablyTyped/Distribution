package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScriptKind extends js.Object

@JSImport("typescript", "ScriptKind")
@js.native
object ScriptKind extends js.Object {
  /**
    * Used on extensions that doesn't define the ScriptKind but the content defines it.
    * Deferred extensions are going to be included in all project contexts.
    */
  @js.native
  sealed trait Deferred
    extends typescriptLib.typescriptMod.ScriptKind
  
  @js.native
  sealed trait External
    extends typescriptLib.typescriptMod.ScriptKind
  
  @js.native
  sealed trait JS
    extends typescriptLib.typescriptMod.ScriptKind
  
  @js.native
  sealed trait JSON
    extends typescriptLib.typescriptMod.ScriptKind
  
  @js.native
  sealed trait JSX
    extends typescriptLib.typescriptMod.ScriptKind
  
  @js.native
  sealed trait TS
    extends typescriptLib.typescriptMod.ScriptKind
  
  @js.native
  sealed trait TSX
    extends typescriptLib.typescriptMod.ScriptKind
  
  @js.native
  sealed trait Unknown
    extends typescriptLib.typescriptMod.ScriptKind
  
  /* 7 */ val Deferred: Deferred with scala.Double = js.native
  /* 5 */ val External: External with scala.Double = js.native
  /* 1 */ val JS: JS with scala.Double = js.native
  /* 6 */ val JSON: JSON with scala.Double = js.native
  /* 2 */ val JSX: JSX with scala.Double = js.native
  /* 3 */ val TS: TS with scala.Double = js.native
  /* 4 */ val TSX: TSX with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.ScriptKind with scala.Double] = js.native
}

