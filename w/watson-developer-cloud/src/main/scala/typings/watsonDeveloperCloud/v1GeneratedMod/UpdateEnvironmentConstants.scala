package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `updateEnvironment` operation. */
object UpdateEnvironmentConstants {
  
  @js.native
  sealed trait Size extends StObject
  /** Size that the environment should be increased to. Environment size cannot be modified when using a Lite plan. Environment size can only increased and not decreased. */
  @JSImport("watson-developer-cloud/discovery/v1-generated", "UpdateEnvironmentConstants.Size")
  @js.native
  object Size extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Size & String] = js.native
    
    @js.native
    sealed trait L
      extends StObject
         with Size
    /* "L" */ val L: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.L & String = js.native
    
    @js.native
    sealed trait M
      extends StObject
         with Size
    /* "M" */ val M: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.M & String = js.native
    
    @js.native
    sealed trait ML
      extends StObject
         with Size
    /* "ML" */ val ML: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.ML & String = js.native
    
    @js.native
    sealed trait MS
      extends StObject
         with Size
    /* "MS" */ val MS: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.MS & String = js.native
    
    @js.native
    sealed trait S
      extends StObject
         with Size
    /* "S" */ val S: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.S & String = js.native
    
    @js.native
    sealed trait XL
      extends StObject
         with Size
    /* "XL" */ val XL: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.XL & String = js.native
    
    @js.native
    sealed trait XXL
      extends StObject
         with Size
    /* "XXL" */ val XXL: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.XXL & String = js.native
    
    @js.native
    sealed trait XXXL
      extends StObject
         with Size
    /* "XXXL" */ val XXXL: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.XXXL & String = js.native
  }
}
