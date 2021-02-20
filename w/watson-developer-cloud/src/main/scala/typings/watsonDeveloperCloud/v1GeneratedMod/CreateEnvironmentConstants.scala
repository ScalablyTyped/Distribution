package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    def apply(value: String): js.UndefOr[Size with String] = js.native
    
    @js.native
    sealed trait L extends Size
    /* "L" */ val L: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.L with String = js.native
    
    @js.native
    sealed trait LT extends Size
    /* "LT" */ val LT: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.LT with String = js.native
    
    @js.native
    sealed trait M extends Size
    /* "M" */ val M: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.M with String = js.native
    
    @js.native
    sealed trait ML extends Size
    /* "ML" */ val ML: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.ML with String = js.native
    
    @js.native
    sealed trait MS extends Size
    /* "MS" */ val MS: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.MS with String = js.native
    
    @js.native
    sealed trait S extends Size
    /* "S" */ val S: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.S with String = js.native
    
    @js.native
    sealed trait XL extends Size
    /* "XL" */ val XL: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.XL with String = js.native
    
    @js.native
    sealed trait XS extends Size
    /* "XS" */ val XS: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.XS with String = js.native
    
    @js.native
    sealed trait XXL extends Size
    /* "XXL" */ val XXL: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.XXL with String = js.native
    
    @js.native
    sealed trait XXXL extends Size
    /* "XXXL" */ val XXXL: typings.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.XXXL with String = js.native
  }
}
