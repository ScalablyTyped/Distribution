package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCircularProgressBarConstantsMod {
  
  @js.native
  sealed trait dataHooks extends StObject
  @JSImport("wix-ui-core/dist/standalone/src/components/circular-progress-bar/constants", "dataHooks")
  @js.native
  object dataHooks extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[dataHooks & String] = js.native
    
    @js.native
    sealed trait errorIcon
      extends StObject
         with dataHooks
    /* "error-icon" */ val errorIcon: typings.wixUiCore.componentsCircularProgressBarConstantsMod.dataHooks.errorIcon & String = js.native
    
    @js.native
    sealed trait label
      extends StObject
         with dataHooks
    /* "label" */ val label: typings.wixUiCore.componentsCircularProgressBarConstantsMod.dataHooks.label & String = js.native
    
    @js.native
    sealed trait progressArcBackground
      extends StObject
         with dataHooks
    /* "progressarc-background" */ val progressArcBackground: typings.wixUiCore.componentsCircularProgressBarConstantsMod.dataHooks.progressArcBackground & String = js.native
    
    @js.native
    sealed trait progressArcForeground
      extends StObject
         with dataHooks
    /* "progressarc-foreground" */ val progressArcForeground: typings.wixUiCore.componentsCircularProgressBarConstantsMod.dataHooks.progressArcForeground & String = js.native
    
    @js.native
    sealed trait progressIndicator
      extends StObject
         with dataHooks
    /* "progress-indicator" */ val progressIndicator: typings.wixUiCore.componentsCircularProgressBarConstantsMod.dataHooks.progressIndicator & String = js.native
    
    @js.native
    sealed trait successIcon
      extends StObject
         with dataHooks
    /* "success-icon" */ val successIcon: typings.wixUiCore.componentsCircularProgressBarConstantsMod.dataHooks.successIcon & String = js.native
  }
}
