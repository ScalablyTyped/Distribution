package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitRefSearchType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitRefSearchType")
@js.native
object GitRefSearchType extends js.Object {
  @js.native
  sealed trait Contains
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefSearchType
  
  @js.native
  sealed trait Exact
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefSearchType
  
  @js.native
  sealed trait StartsWith
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefSearchType
  
  /* 2 */ val Contains: Contains with scala.Double = js.native
  /* 0 */ val Exact: Exact with scala.Double = js.native
  /* 1 */ val StartsWith: StartsWith with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefSearchType with scala.Double
  ] = js.native
}

