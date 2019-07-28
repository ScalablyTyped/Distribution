package typings.atUirouterCore.libCommonTraceMod

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
  
  /* 2 */ val HOOK: typings.atUirouterCore.libCommonTraceMod.Category.HOOK with Double = js.native
  /* 0 */ val RESOLVE: typings.atUirouterCore.libCommonTraceMod.Category.RESOLVE with Double = js.native
  /* 1 */ val TRANSITION: typings.atUirouterCore.libCommonTraceMod.Category.TRANSITION with Double = js.native
  /* 3 */ val UIVIEW: typings.atUirouterCore.libCommonTraceMod.Category.UIVIEW with Double = js.native
  /* 4 */ val VIEWCONFIG: typings.atUirouterCore.libCommonTraceMod.Category.VIEWCONFIG with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Category with Double] = js.native
}

