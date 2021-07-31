package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleSwitchConstantsMod {
  
  @js.native
  sealed trait dataHooks extends StObject
  @JSImport("wix-ui-core/dist/src/components/toggle-switch/constants", "dataHooks")
  @js.native
  object dataHooks extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[dataHooks & String] = js.native
    
    @js.native
    sealed trait knob
      extends StObject
         with dataHooks
    /* "knob" */ val knob: typings.wixUiCore.toggleSwitchConstantsMod.dataHooks.knob & String = js.native
    
    @js.native
    sealed trait knobIcon
      extends StObject
         with dataHooks
    /* "knob-icon" */ val knobIcon: typings.wixUiCore.toggleSwitchConstantsMod.dataHooks.knobIcon & String = js.native
    
    @js.native
    sealed trait toggleSwitchInput
      extends StObject
         with dataHooks
    /* "toggle-switch-input" */ val toggleSwitchInput: typings.wixUiCore.toggleSwitchConstantsMod.dataHooks.toggleSwitchInput & String = js.native
    
    @js.native
    sealed trait track
      extends StObject
         with dataHooks
    /* "track" */ val track: typings.wixUiCore.toggleSwitchConstantsMod.dataHooks.track & String = js.native
  }
}
