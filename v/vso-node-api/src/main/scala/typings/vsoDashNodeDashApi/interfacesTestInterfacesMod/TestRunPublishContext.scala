package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestRunPublishContext with Double] = js.native
  /* 3 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 1 */ @js.native
  object Build extends TopLevel[Build with Double]
  
  /* 2 */ @js.native
  object Release extends TopLevel[Release with Double]
  
}

