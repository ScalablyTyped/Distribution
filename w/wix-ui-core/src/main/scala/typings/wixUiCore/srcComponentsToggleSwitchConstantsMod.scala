package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsToggleSwitchConstantsMod {
  
  @js.native
  sealed trait dataHooks extends StObject
  @JSImport("wix-ui-core/src/components/toggle-switch/constants", "dataHooks")
  @js.native
  object dataHooks extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[dataHooks & String] = js.native
    
    @js.native
    sealed trait knob
      extends StObject
         with dataHooks
    /* "knob" */ val knob: typings.wixUiCore.srcComponentsToggleSwitchConstantsMod.dataHooks.knob & String = js.native
    
    @js.native
    sealed trait knobIcon
      extends StObject
         with dataHooks
    /* "knob-icon" */ val knobIcon: typings.wixUiCore.srcComponentsToggleSwitchConstantsMod.dataHooks.knobIcon & String = js.native
    
    @js.native
    sealed trait toggleSwitchInput
      extends StObject
         with dataHooks
    /* "toggle-switch-input" */ val toggleSwitchInput: typings.wixUiCore.srcComponentsToggleSwitchConstantsMod.dataHooks.toggleSwitchInput & String = js.native
    
    @js.native
    sealed trait track
      extends StObject
         with dataHooks
    /* "track" */ val track: typings.wixUiCore.srcComponentsToggleSwitchConstantsMod.dataHooks.track & String = js.native
  }
}
