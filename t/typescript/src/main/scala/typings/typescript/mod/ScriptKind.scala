package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptKind extends js.Object
@JSImport("typescript", "ScriptKind")
@js.native
object ScriptKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptKind with Double] = js.native
  
  /**
    * Used on extensions that doesn't define the ScriptKind but the content defines it.
    * Deferred extensions are going to be included in all project contexts.
    */
  @js.native
  sealed trait Deferred extends ScriptKind
  /* 7 */ @js.native
  object Deferred extends TopLevel[Deferred with Double]
  
  @js.native
  sealed trait External extends ScriptKind
  /* 5 */ @js.native
  object External extends TopLevel[External with Double]
  
  @js.native
  sealed trait JS extends ScriptKind
  /* 1 */ @js.native
  object JS extends TopLevel[JS with Double]
  
  @js.native
  sealed trait JSON extends ScriptKind
  /* 6 */ @js.native
  object JSON extends TopLevel[JSON with Double]
  
  @js.native
  sealed trait JSX extends ScriptKind
  /* 2 */ @js.native
  object JSX extends TopLevel[JSX with Double]
  
  @js.native
  sealed trait TS extends ScriptKind
  /* 3 */ @js.native
  object TS extends TopLevel[TS with Double]
  
  @js.native
  sealed trait TSX extends ScriptKind
  /* 4 */ @js.native
  object TSX extends TopLevel[TSX with Double]
  
  @js.native
  sealed trait Unknown extends ScriptKind
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
}
