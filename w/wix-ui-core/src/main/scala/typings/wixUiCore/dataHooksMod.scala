package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataHooksMod {
  
  @js.native
  sealed trait ProgressBarAriaKeys extends StObject
  @JSImport("wix-ui-core/dist/src/components/linear-progress-bar/DataHooks", "ProgressBarAriaKeys")
  @js.native
  object ProgressBarAriaKeys extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ProgressBarAriaKeys & String] = js.native
    
    @js.native
    sealed trait valuemax
      extends StObject
         with ProgressBarAriaKeys
    /* "aria-valuemax" */ val valuemax: typings.wixUiCore.dataHooksMod.ProgressBarAriaKeys.valuemax & String = js.native
    
    @js.native
    sealed trait valuemin
      extends StObject
         with ProgressBarAriaKeys
    /* "aria-valuemin" */ val valuemin: typings.wixUiCore.dataHooksMod.ProgressBarAriaKeys.valuemin & String = js.native
    
    @js.native
    sealed trait valuenow
      extends StObject
         with ProgressBarAriaKeys
    /* "aria-valuenow" */ val valuenow: typings.wixUiCore.dataHooksMod.ProgressBarAriaKeys.valuenow & String = js.native
    
    @js.native
    sealed trait valuetext
      extends StObject
         with ProgressBarAriaKeys
    /* "aria-valuetext" */ val valuetext: typings.wixUiCore.dataHooksMod.ProgressBarAriaKeys.valuetext & String = js.native
  }
  
  @js.native
  sealed trait ProgressBarDataHooks extends StObject
  @JSImport("wix-ui-core/dist/src/components/linear-progress-bar/DataHooks", "ProgressBarDataHooks")
  @js.native
  object ProgressBarDataHooks extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ProgressBarDataHooks & String] = js.native
    
    @js.native
    sealed trait background
      extends StObject
         with ProgressBarDataHooks
    /* "progressbar-background" */ val background: typings.wixUiCore.dataHooksMod.ProgressBarDataHooks.background & String = js.native
    
    @js.native
    sealed trait container
      extends StObject
         with ProgressBarDataHooks
    /* "progressbar-container" */ val container: typings.wixUiCore.dataHooksMod.ProgressBarDataHooks.container & String = js.native
    
    @js.native
    sealed trait errorIcon
      extends StObject
         with ProgressBarDataHooks
    /* "error-icon" */ val errorIcon: typings.wixUiCore.dataHooksMod.ProgressBarDataHooks.errorIcon & String = js.native
    
    @js.native
    sealed trait foreground
      extends StObject
         with ProgressBarDataHooks
    /* "progressbar-foreground" */ val foreground: typings.wixUiCore.dataHooksMod.ProgressBarDataHooks.foreground & String = js.native
    
    @js.native
    sealed trait progressIndicator
      extends StObject
         with ProgressBarDataHooks
    /* "progress-indicator" */ val progressIndicator: typings.wixUiCore.dataHooksMod.ProgressBarDataHooks.progressIndicator & String = js.native
    
    @js.native
    sealed trait progressPercentage
      extends StObject
         with ProgressBarDataHooks
    /* "progress-percentages" */ val progressPercentage: typings.wixUiCore.dataHooksMod.ProgressBarDataHooks.progressPercentage & String = js.native
    
    @js.native
    sealed trait successIcon
      extends StObject
         with ProgressBarDataHooks
    /* "success-icon" */ val successIcon: typings.wixUiCore.dataHooksMod.ProgressBarDataHooks.successIcon & String = js.native
  }
  
  @js.native
  sealed trait ProgressBarDataKeys extends StObject
  @JSImport("wix-ui-core/dist/src/components/linear-progress-bar/DataHooks", "ProgressBarDataKeys")
  @js.native
  object ProgressBarDataKeys extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ProgressBarDataKeys & String] = js.native
    
    @js.native
    sealed trait max
      extends StObject
         with ProgressBarDataKeys
    /* "data-progress-max-value" */ val max: typings.wixUiCore.dataHooksMod.ProgressBarDataKeys.max & String = js.native
    
    @js.native
    sealed trait min
      extends StObject
         with ProgressBarDataKeys
    /* "data-progress-min-value" */ val min: typings.wixUiCore.dataHooksMod.ProgressBarDataKeys.min & String = js.native
    
    @js.native
    sealed trait value
      extends StObject
         with ProgressBarDataKeys
    /* "data-progress-value" */ val value: typings.wixUiCore.dataHooksMod.ProgressBarDataKeys.value & String = js.native
  }
}
