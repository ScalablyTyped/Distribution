package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptKind extends StObject
@JSImport("typescript", "ScriptKind")
@js.native
object ScriptKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptKind with Double] = js.native
  
  /**
    * Used on extensions that doesn't define the ScriptKind but the content defines it.
    * Deferred extensions are going to be included in all project contexts.
    */
  @js.native
  sealed trait Deferred extends ScriptKind
  /* 7 */ val Deferred: typings.typescript.mod.ScriptKind.Deferred with Double = js.native
  
  @js.native
  sealed trait External extends ScriptKind
  /* 5 */ val External: typings.typescript.mod.ScriptKind.External with Double = js.native
  
  @js.native
  sealed trait JS extends ScriptKind
  /* 1 */ val JS: typings.typescript.mod.ScriptKind.JS with Double = js.native
  
  @js.native
  sealed trait JSON extends ScriptKind
  /* 6 */ val JSON: typings.typescript.mod.ScriptKind.JSON with Double = js.native
  
  @js.native
  sealed trait JSX extends ScriptKind
  /* 2 */ val JSX: typings.typescript.mod.ScriptKind.JSX with Double = js.native
  
  @js.native
  sealed trait TS extends ScriptKind
  /* 3 */ val TS: typings.typescript.mod.ScriptKind.TS with Double = js.native
  
  @js.native
  sealed trait TSX extends ScriptKind
  /* 4 */ val TSX: typings.typescript.mod.ScriptKind.TSX with Double = js.native
  
  @js.native
  sealed trait Unknown extends ScriptKind
  /* 0 */ val Unknown: typings.typescript.mod.ScriptKind.Unknown with Double = js.native
}
