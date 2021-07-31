package typings.wixUiCore

import typings.wixUiCore.anon.Enter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsShouldAnimatePopoverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/utils/shouldAnimatePopover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def shouldAnimatePopover(timeout: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldAnimatePopover")(timeout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def shouldAnimatePopover(timeout: Enter): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldAnimatePopover")(timeout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
