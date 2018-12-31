package typings
package atUirouterAngularjsLib.angularjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("@uirouter/angularjs", "Category")
@js.native
object Category extends js.Object {
  /* 2 */ val HOOK: atUirouterCoreLib.libCommonTraceMod.Category.HOOK with scala.Double = js.native
  /* 0 */ val RESOLVE: atUirouterCoreLib.libCommonTraceMod.Category.RESOLVE with scala.Double = js.native
  /* 1 */ val TRANSITION: atUirouterCoreLib.libCommonTraceMod.Category.TRANSITION with scala.Double = js.native
  /* 3 */ val UIVIEW: atUirouterCoreLib.libCommonTraceMod.Category.UIVIEW with scala.Double = js.native
  /* 4 */ val VIEWCONFIG: atUirouterCoreLib.libCommonTraceMod.Category.VIEWCONFIG with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atUirouterCoreLib.libCommonTraceMod.Category with scala.Double] = js.native
}

