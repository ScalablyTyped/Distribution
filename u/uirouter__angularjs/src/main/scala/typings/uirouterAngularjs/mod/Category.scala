package typings.uirouterAngularjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def apply(value: Double): js.UndefOr[typings.uirouterCore.traceMod.Category with Double] = js.native
  
  /* 2 */ val HOOK: typings.uirouterCore.traceMod.Category.HOOK with Double = js.native
  
  /* 0 */ val RESOLVE: typings.uirouterCore.traceMod.Category.RESOLVE with Double = js.native
  
  /* 1 */ val TRANSITION: typings.uirouterCore.traceMod.Category.TRANSITION with Double = js.native
  
  /* 3 */ val UIVIEW: typings.uirouterCore.traceMod.Category.UIVIEW with Double = js.native
  
  /* 4 */ val VIEWCONFIG: typings.uirouterCore.traceMod.Category.VIEWCONFIG with Double = js.native
}
