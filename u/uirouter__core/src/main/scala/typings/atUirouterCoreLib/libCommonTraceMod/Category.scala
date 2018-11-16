package typings
package atUirouterCoreLib.libCommonTraceMod

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
  sealed trait HOOK
    extends atUirouterCoreLib.libCommonTraceMod.Category
  
  @js.native
  sealed trait RESOLVE
    extends atUirouterCoreLib.libCommonTraceMod.Category
  
  @js.native
  sealed trait TRANSITION
    extends atUirouterCoreLib.libCommonTraceMod.Category
  
  @js.native
  sealed trait UIVIEW
    extends atUirouterCoreLib.libCommonTraceMod.Category
  
  @js.native
  sealed trait VIEWCONFIG
    extends atUirouterCoreLib.libCommonTraceMod.Category
  
  /* 2 */ val HOOK: HOOK with scala.Double = js.native
  /* 0 */ val RESOLVE: RESOLVE with scala.Double = js.native
  /* 1 */ val TRANSITION: TRANSITION with scala.Double = js.native
  /* 3 */ val UIVIEW: UIVIEW with scala.Double = js.native
  /* 4 */ val VIEWCONFIG: VIEWCONFIG with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atUirouterCoreLib.libCommonTraceMod.Category with scala.Double] = js.native
}

