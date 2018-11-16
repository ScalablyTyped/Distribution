package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TestRunPublishContext extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "TestRunPublishContext")
@js.native
object TestRunPublishContext extends js.Object {
  /**
       * Run is published for any Context.
       */
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunPublishContext
  
  /**
       * Run is published for Build Context.
       */
  @js.native
  sealed trait Build
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunPublishContext
  
  /**
       * Run is published for Release Context.
       */
  @js.native
  sealed trait Release
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunPublishContext
  
  /* 3 */ val All: All with scala.Double = js.native
  /* 1 */ val Build: Build with scala.Double = js.native
  /* 2 */ val Release: Release with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunPublishContext with scala.Double
  ] = js.native
}

