package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressBarConstantsMod {
  
  @js.native
  sealed trait dataHooks extends StObject
  @JSImport("wix-ui-core/dist/src/components/circular-progress-bar/constants", "dataHooks")
  @js.native
  object dataHooks extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[dataHooks & String] = js.native
    
    @js.native
    sealed trait errorIcon
      extends StObject
         with dataHooks
    /* "error-icon" */ val errorIcon: typings.wixUiCore.circularProgressBarConstantsMod.dataHooks.errorIcon & String = js.native
    
    @js.native
    sealed trait label
      extends StObject
         with dataHooks
    /* "label" */ val label: typings.wixUiCore.circularProgressBarConstantsMod.dataHooks.label & String = js.native
    
    @js.native
    sealed trait progressArcBackground
      extends StObject
         with dataHooks
    /* "progressarc-background" */ val progressArcBackground: typings.wixUiCore.circularProgressBarConstantsMod.dataHooks.progressArcBackground & String = js.native
    
    @js.native
    sealed trait progressArcForeground
      extends StObject
         with dataHooks
    /* "progressarc-foreground" */ val progressArcForeground: typings.wixUiCore.circularProgressBarConstantsMod.dataHooks.progressArcForeground & String = js.native
    
    @js.native
    sealed trait progressIndicator
      extends StObject
         with dataHooks
    /* "progress-indicator" */ val progressIndicator: typings.wixUiCore.circularProgressBarConstantsMod.dataHooks.progressIndicator & String = js.native
    
    @js.native
    sealed trait successIcon
      extends StObject
         with dataHooks
    /* "success-icon" */ val successIcon: typings.wixUiCore.circularProgressBarConstantsMod.dataHooks.successIcon & String = js.native
  }
}
