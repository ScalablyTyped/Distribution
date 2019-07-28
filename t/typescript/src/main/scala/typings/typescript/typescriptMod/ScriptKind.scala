package typings.typescript.typescriptMod

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
  sealed trait Deferred extends ScriptKind
  
  @js.native
  sealed trait External extends ScriptKind
  
  @js.native
  sealed trait JS extends ScriptKind
  
  @js.native
  sealed trait JSON extends ScriptKind
  
  @js.native
  sealed trait JSX extends ScriptKind
  
  @js.native
  sealed trait TS extends ScriptKind
  
  @js.native
  sealed trait TSX extends ScriptKind
  
  @js.native
  sealed trait Unknown extends ScriptKind
  
  /* 7 */ val Deferred: typings.typescript.typescriptMod.ScriptKind.Deferred with Double = js.native
  /* 5 */ val External: typings.typescript.typescriptMod.ScriptKind.External with Double = js.native
  /* 1 */ val JS: typings.typescript.typescriptMod.ScriptKind.JS with Double = js.native
  /* 6 */ val JSON: typings.typescript.typescriptMod.ScriptKind.JSON with Double = js.native
  /* 2 */ val JSX: typings.typescript.typescriptMod.ScriptKind.JSX with Double = js.native
  /* 3 */ val TS: typings.typescript.typescriptMod.ScriptKind.TS with Double = js.native
  /* 4 */ val TSX: typings.typescript.typescriptMod.ScriptKind.TSX with Double = js.native
  /* 0 */ val Unknown: typings.typescript.typescriptMod.ScriptKind.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptKind with Double] = js.native
}

