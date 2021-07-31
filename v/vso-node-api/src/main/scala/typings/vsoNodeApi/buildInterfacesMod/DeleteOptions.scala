package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeleteOptions extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "DeleteOptions")
@js.native
object DeleteOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeleteOptions & Double] = js.native
  
  /**
    * All data should be deleted.
    */
  @js.native
  sealed trait All
    extends StObject
       with DeleteOptions
  /* 31 */ val All: typings.vsoNodeApi.buildInterfacesMod.DeleteOptions.All & Double = js.native
  
  /**
    * The build should be deleted.
    */
  @js.native
  sealed trait Details
    extends StObject
       with DeleteOptions
  /* 8 */ val Details: typings.vsoNodeApi.buildInterfacesMod.DeleteOptions.Details & Double = js.native
  
  /**
    * The drop location should be deleted.
    */
  @js.native
  sealed trait DropLocation
    extends StObject
       with DeleteOptions
  /* 1 */ val DropLocation: typings.vsoNodeApi.buildInterfacesMod.DeleteOptions.DropLocation & Double = js.native
  
  /**
    * The version control label should be deleted.
    */
  @js.native
  sealed trait Label
    extends StObject
       with DeleteOptions
  /* 4 */ val Label: typings.vsoNodeApi.buildInterfacesMod.DeleteOptions.Label & Double = js.native
  
  /**
    * No data should be deleted. This value should not be used.
    */
  @js.native
  sealed trait None
    extends StObject
       with DeleteOptions
  /* 0 */ val None: typings.vsoNodeApi.buildInterfacesMod.DeleteOptions.None & Double = js.native
  
  /**
    * Published symbols should be deleted.
    */
  @js.native
  sealed trait Symbols
    extends StObject
       with DeleteOptions
  /* 16 */ val Symbols: typings.vsoNodeApi.buildInterfacesMod.DeleteOptions.Symbols & Double = js.native
  
  /**
    * The test results should be deleted.
    */
  @js.native
  sealed trait TestResults
    extends StObject
       with DeleteOptions
  /* 2 */ val TestResults: typings.vsoNodeApi.buildInterfacesMod.DeleteOptions.TestResults & Double = js.native
}
