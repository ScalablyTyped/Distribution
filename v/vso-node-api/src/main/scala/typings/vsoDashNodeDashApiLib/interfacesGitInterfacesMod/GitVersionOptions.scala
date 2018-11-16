package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitVersionOptions extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitVersionOptions")
@js.native
object GitVersionOptions extends js.Object {
  /**
       * First parent of commit (HEAD^)
       */
  @js.native
  sealed trait FirstParent
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionOptions
  
  /**
       * Not specified
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionOptions
  
  /**
       * Commit that changed item prior to the current version
       */
  @js.native
  sealed trait PreviousChange
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionOptions
  
  /* 2 */ val FirstParent: FirstParent with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val PreviousChange: PreviousChange with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionOptions with scala.Double
  ] = js.native
}

