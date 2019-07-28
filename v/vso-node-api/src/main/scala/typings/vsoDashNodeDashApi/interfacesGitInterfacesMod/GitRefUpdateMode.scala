package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitRefUpdateMode extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitRefUpdateMode")
@js.native
object GitRefUpdateMode extends js.Object {
  /**
    * Indicates that all ref updates must succeed or none will succeed. All ref updates will be atomically written. If any failure is encountered, previously successful updates will be rolled back and the entire operation will fail.
    */
  @js.native
  sealed trait AllOrNone extends GitRefUpdateMode
  
  /**
    * Indicates the Git protocol model where any refs that can be updated will be updated, but any failures will not prevent other updates from succeeding.
    */
  @js.native
  sealed trait BestEffort extends GitRefUpdateMode
  
  /* 1 */ val AllOrNone: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateMode.AllOrNone with Double = js.native
  /* 0 */ val BestEffort: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateMode.BestEffort with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitRefUpdateMode with Double] = js.native
}

