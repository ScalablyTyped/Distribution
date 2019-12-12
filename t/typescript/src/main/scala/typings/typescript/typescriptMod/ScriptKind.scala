package typings.typescript.typescriptMod

import org.scalablytyped.runtime.TopLevel
import typings.typescript.typescriptMod.ScriptKind.Deferred
import typings.typescript.typescriptMod.ScriptKind.External
import typings.typescript.typescriptMod.ScriptKind.JS
import typings.typescript.typescriptMod.ScriptKind.JSON
import typings.typescript.typescriptMod.ScriptKind.JSX
import typings.typescript.typescriptMod.ScriptKind.TS
import typings.typescript.typescriptMod.ScriptKind.TSX
import typings.typescript.typescriptMod.ScriptKind.Unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptKind with Double] = js.native
  /* 7 */ @js.native
  object Deferred extends TopLevel[Deferred with Double]
  
  /* 5 */ @js.native
  object External extends TopLevel[External with Double]
  
  /* 1 */ @js.native
  object JS extends TopLevel[JS with Double]
  
  /* 6 */ @js.native
  object JSON extends TopLevel[JSON with Double]
  
  /* 2 */ @js.native
  object JSX extends TopLevel[JSX with Double]
  
  /* 3 */ @js.native
  object TS extends TopLevel[TS with Double]
  
  /* 4 */ @js.native
  object TSX extends TopLevel[TSX with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}

