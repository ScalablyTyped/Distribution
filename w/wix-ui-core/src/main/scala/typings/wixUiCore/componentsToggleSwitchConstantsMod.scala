package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsToggleSwitchConstantsMod {
  
  @js.native
  sealed trait dataHooks extends StObject
  @JSImport("wix-ui-core/dist/standalone/src/components/toggle-switch/constants", "dataHooks")
  @js.native
  object dataHooks extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[dataHooks & String] = js.native
    
    @js.native
    sealed trait knob
      extends StObject
         with dataHooks
    /* "knob" */ val knob: typings.wixUiCore.componentsToggleSwitchConstantsMod.dataHooks.knob & String = js.native
    
    @js.native
    sealed trait knobIcon
      extends StObject
         with dataHooks
    /* "knob-icon" */ val knobIcon: typings.wixUiCore.componentsToggleSwitchConstantsMod.dataHooks.knobIcon & String = js.native
    
    @js.native
    sealed trait toggleSwitchInput
      extends StObject
         with dataHooks
    /* "toggle-switch-input" */ val toggleSwitchInput: typings.wixUiCore.componentsToggleSwitchConstantsMod.dataHooks.toggleSwitchInput & String = js.native
    
    @js.native
    sealed trait track
      extends StObject
         with dataHooks
    /* "track" */ val track: typings.wixUiCore.componentsToggleSwitchConstantsMod.dataHooks.track & String = js.native
  }
}
