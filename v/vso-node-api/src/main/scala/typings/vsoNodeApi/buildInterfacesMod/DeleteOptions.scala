package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeleteOptions extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "DeleteOptions")
@js.native
object DeleteOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeleteOptions with Double] = js.native
  
  /**
    * All data should be deleted.
    */
  @js.native
  sealed trait All extends DeleteOptions
  /* 31 */ val All: typings.vsoNodeApi.buildInterfacesMod.DeleteOptions.All with Double = js.native
  
  /**
    * The build should be deleted.
    */
  @js.native
  sealed trait Details extends DeleteOptions
  /* 8 */ val Details: typings.vsoNodeApi.buildInterfacesMod.DeleteOptions.Details with Double = js.native
  
  /**
    * The drop location should be deleted.
    */
  @js.native
  sealed trait DropLocation extends DeleteOptions
  /* 1 */ val DropLocation: typings.vsoNodeApi.buildInterfacesMod.DeleteOptions.DropLocation with Double = js.native
  
  /**
    * The version control label should be deleted.
    */
  @js.native
  sealed trait Label extends DeleteOptions
  /* 4 */ val Label: typings.vsoNodeApi.buildInterfacesMod.DeleteOptions.Label with Double = js.native
  
  /**
    * No data should be deleted. This value should not be used.
    */
  @js.native
  sealed trait None extends DeleteOptions
  /* 0 */ val None: typings.vsoNodeApi.buildInterfacesMod.DeleteOptions.None with Double = js.native
  
  /**
    * Published symbols should be deleted.
    */
  @js.native
  sealed trait Symbols extends DeleteOptions
  /* 16 */ val Symbols: typings.vsoNodeApi.buildInterfacesMod.DeleteOptions.Symbols with Double = js.native
  
  /**
    * The test results should be deleted.
    */
  @js.native
  sealed trait TestResults extends DeleteOptions
  /* 2 */ val TestResults: typings.vsoNodeApi.buildInterfacesMod.DeleteOptions.TestResults with Double = js.native
}
