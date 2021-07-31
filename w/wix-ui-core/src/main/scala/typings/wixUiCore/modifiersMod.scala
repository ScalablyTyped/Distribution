package typings.wixUiCore

import typings.popperJs.mod.Popper.Modifiers
import typings.wixUiCore.anon.DynamicWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersMod {
  
  @JSImport("wix-ui-core/dist/src/components/popover/modifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createModifiers(hasWidthMoveByAppendToShouldAnimateFlipFixedPlacementIsTestEnvMinWidthDynamicWidth: DynamicWidth): Modifiers = ^.asInstanceOf[js.Dynamic].applyDynamic("createModifiers")(hasWidthMoveByAppendToShouldAnimateFlipFixedPlacementIsTestEnvMinWidthDynamicWidth.asInstanceOf[js.Any]).asInstanceOf[Modifiers]
}
