package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createEnvironment` operation. */
object CreateEnvironmentConstants {
  
  @js.native
  sealed trait Size extends StObject
  /** Size of the environment. In the Lite plan the default and only accepted value is `LT`, in all other plans the default is `S`. */
  @JSImport("watson-developer-cloud/discovery/v1-generated", "CreateEnvironmentConstants.Size")
  @js.native
  object Size extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Size & String] = js.native
    
    @js.native
    sealed trait L
      extends StObject
         with Size
    /* "L" */ val L: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateEnvironmentConstants.Size.L & String = js.native
    
    @js.native
    sealed trait LT
      extends StObject
         with Size
    /* "LT" */ val LT: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateEnvironmentConstants.Size.LT & String = js.native
    
    @js.native
    sealed trait M
      extends StObject
         with Size
    /* "M" */ val M: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateEnvironmentConstants.Size.M & String = js.native
    
    @js.native
    sealed trait ML
      extends StObject
         with Size
    /* "ML" */ val ML: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateEnvironmentConstants.Size.ML & String = js.native
    
    @js.native
    sealed trait MS
      extends StObject
         with Size
    /* "MS" */ val MS: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateEnvironmentConstants.Size.MS & String = js.native
    
    @js.native
    sealed trait S
      extends StObject
         with Size
    /* "S" */ val S: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateEnvironmentConstants.Size.S & String = js.native
    
    @js.native
    sealed trait XL
      extends StObject
         with Size
    /* "XL" */ val XL: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateEnvironmentConstants.Size.XL & String = js.native
    
    @js.native
    sealed trait XS
      extends StObject
         with Size
    /* "XS" */ val XS: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateEnvironmentConstants.Size.XS & String = js.native
    
    @js.native
    sealed trait XXL
      extends StObject
         with Size
    /* "XXL" */ val XXL: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateEnvironmentConstants.Size.XXL & String = js.native
    
    @js.native
    sealed trait XXXL
      extends StObject
         with Size
    /* "XXXL" */ val XXXL: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateEnvironmentConstants.Size.XXXL & String = js.native
  }
}
