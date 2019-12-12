package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateMode.AllOrNone
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateMode.BestEffort
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitRefUpdateMode with Double] = js.native
  /* 1 */ @js.native
  object AllOrNone extends TopLevel[AllOrNone with Double]
  
  /* 0 */ @js.native
  object BestEffort extends TopLevel[BestEffort with Double]
  
}

