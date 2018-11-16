package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TfvcVersionOption extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "TfvcVersionOption")
@js.native
object TfvcVersionOption extends js.Object {
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.TfvcVersionOption
  
  @js.native
  sealed trait Previous
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.TfvcVersionOption
  
  @js.native
  sealed trait UseRename
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.TfvcVersionOption
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Previous: Previous with scala.Double = js.native
  /* 2 */ val UseRename: UseRename with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.TfvcVersionOption with scala.Double
  ] = js.native
}

