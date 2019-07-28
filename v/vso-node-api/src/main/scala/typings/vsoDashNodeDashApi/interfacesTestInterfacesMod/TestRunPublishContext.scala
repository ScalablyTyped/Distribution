package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
  sealed trait All extends TestRunPublishContext
  
  /**
    * Run is published for Build Context.
    */
  @js.native
  sealed trait Build extends TestRunPublishContext
  
  /**
    * Run is published for Release Context.
    */
  @js.native
  sealed trait Release extends TestRunPublishContext
  
  /* 3 */ val All: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunPublishContext.All with Double = js.native
  /* 1 */ val Build: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunPublishContext.Build with Double = js.native
  /* 2 */ val Release: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunPublishContext.Release with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestRunPublishContext with Double] = js.native
}

