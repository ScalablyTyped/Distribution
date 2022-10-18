package typings.uirouterAngularjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Category extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.uirouterCore.libCommonTraceMod.Category & Double] = js.native
  
  /* 2 */ val HOOK: typings.uirouterCore.libCommonTraceMod.Category.HOOK & Double = js.native
  
  /* 0 */ val RESOLVE: typings.uirouterCore.libCommonTraceMod.Category.RESOLVE & Double = js.native
  
  /* 1 */ val TRANSITION: typings.uirouterCore.libCommonTraceMod.Category.TRANSITION & Double = js.native
  
  /* 3 */ val UIVIEW: typings.uirouterCore.libCommonTraceMod.Category.UIVIEW & Double = js.native
  
  /* 4 */ val VIEWCONFIG: typings.uirouterCore.libCommonTraceMod.Category.VIEWCONFIG & Double = js.native
}
