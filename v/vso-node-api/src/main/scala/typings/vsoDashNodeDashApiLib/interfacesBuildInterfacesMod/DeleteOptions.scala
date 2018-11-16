package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

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
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DeleteOptions
  
  /**
       * The build should be deleted.
       */
  @js.native
  sealed trait Details
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DeleteOptions
  
  /**
       * The drop location should be deleted.
       */
  @js.native
  sealed trait DropLocation
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DeleteOptions
  
  /**
       * The version control label should be deleted.
       */
  @js.native
  sealed trait Label
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DeleteOptions
  
  /**
       * No data should be deleted. This value should not be used.
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DeleteOptions
  
  /**
       * Published symbols should be deleted.
       */
  @js.native
  sealed trait Symbols
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DeleteOptions
  
  /**
       * The test results should be deleted.
       */
  @js.native
  sealed trait TestResults
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DeleteOptions
  
  /* 31 */ val All: All with scala.Double = js.native
  /* 8 */ val Details: Details with scala.Double = js.native
  /* 1 */ val DropLocation: DropLocation with scala.Double = js.native
  /* 4 */ val Label: Label with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 16 */ val Symbols: Symbols with scala.Double = js.native
  /* 2 */ val TestResults: TestResults with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DeleteOptions with scala.Double
  ] = js.native
}

