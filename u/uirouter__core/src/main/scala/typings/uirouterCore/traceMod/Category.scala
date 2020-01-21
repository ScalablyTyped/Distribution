package typings.uirouterCore.traceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Category extends js.Object

/**
  * Trace categories Enum
  *
  * Enable or disable a category using [[Trace.enable]] or [[Trace.disable]]
  *
  * `trace.enable(Category.TRANSITION)`
  *
  * These can also be provided using a matching string, or position ordinal
  *
  * `trace.enable("TRANSITION")`
  *
  * `trace.enable(1)`
  */
@JSImport("@uirouter/core/lib/common/trace", "Category")
@js.native
object Category extends js.Object {
  @js.native
  sealed trait HOOK extends Category
  
  @js.native
  sealed trait RESOLVE extends Category
  
  @js.native
  sealed trait TRANSITION extends Category
  
  @js.native
  sealed trait UIVIEW extends Category
  
  @js.native
  sealed trait VIEWCONFIG extends Category
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Category with Double] = js.native
  /* 2 */ @js.native
  object HOOK extends TopLevel[HOOK with Double]
  
  /* 0 */ @js.native
  object RESOLVE extends TopLevel[RESOLVE with Double]
  
  /* 1 */ @js.native
  object TRANSITION extends TopLevel[TRANSITION with Double]
  
  /* 3 */ @js.native
  object UIVIEW extends TopLevel[UIVIEW with Double]
  
  /* 4 */ @js.native
  object VIEWCONFIG extends TopLevel[VIEWCONFIG with Double]
  
}

