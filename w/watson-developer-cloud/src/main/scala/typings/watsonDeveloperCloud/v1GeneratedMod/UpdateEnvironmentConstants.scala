package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    def apply(value: String): js.UndefOr[Size with String] = js.native
    
    @js.native
    sealed trait L extends Size
    /* "L" */ val L: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.L with String = js.native
    
    @js.native
    sealed trait M extends Size
    /* "M" */ val M: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.M with String = js.native
    
    @js.native
    sealed trait ML extends Size
    /* "ML" */ val ML: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.ML with String = js.native
    
    @js.native
    sealed trait MS extends Size
    /* "MS" */ val MS: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.MS with String = js.native
    
    @js.native
    sealed trait S extends Size
    /* "S" */ val S: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.S with String = js.native
    
    @js.native
    sealed trait XL extends Size
    /* "XL" */ val XL: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.XL with String = js.native
    
    @js.native
    sealed trait XXL extends Size
    /* "XXL" */ val XXL: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.XXL with String = js.native
    
    @js.native
    sealed trait XXXL extends Size
    /* "XXXL" */ val XXXL: typings.watsonDeveloperCloud.v1GeneratedMod.UpdateEnvironmentConstants.Size.XXXL with String = js.native
  }
}
