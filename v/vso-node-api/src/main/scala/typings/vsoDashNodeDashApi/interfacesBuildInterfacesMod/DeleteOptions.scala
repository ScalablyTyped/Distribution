package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeleteOptions extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "DeleteOptions")
@js.native
object DeleteOptions extends js.Object {
  /**
    * All data should be deleted.
    */
  @js.native
  sealed trait All extends DeleteOptions
  
  /**
    * The build should be deleted.
    */
  @js.native
  sealed trait Details extends DeleteOptions
  
  /**
    * The drop location should be deleted.
    */
  @js.native
  sealed trait DropLocation extends DeleteOptions
  
  /**
    * The version control label should be deleted.
    */
  @js.native
  sealed trait Label extends DeleteOptions
  
  /**
    * No data should be deleted. This value should not be used.
    */
  @js.native
  sealed trait None extends DeleteOptions
  
  /**
    * Published symbols should be deleted.
    */
  @js.native
  sealed trait Symbols extends DeleteOptions
  
  /**
    * The test results should be deleted.
    */
  @js.native
  sealed trait TestResults extends DeleteOptions
  
  /* 31 */ val All: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DeleteOptions.All with Double = js.native
  /* 8 */ val Details: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DeleteOptions.Details with Double = js.native
  /* 1 */ val DropLocation: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DeleteOptions.DropLocation with Double = js.native
  /* 4 */ val Label: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DeleteOptions.Label with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DeleteOptions.None with Double = js.native
  /* 16 */ val Symbols: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DeleteOptions.Symbols with Double = js.native
  /* 2 */ val TestResults: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DeleteOptions.TestResults with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeleteOptions with Double] = js.native
}

