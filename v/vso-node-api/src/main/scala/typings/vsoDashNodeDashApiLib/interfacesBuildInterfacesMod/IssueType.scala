package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IssueType extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "IssueType")
@js.native
object IssueType extends js.Object {
  @js.native
  sealed trait Error
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.IssueType
  
  @js.native
  sealed trait Warning
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.IssueType
  
  /* 1 */ val Error: Error with scala.Double = js.native
  /* 2 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.IssueType with scala.Double] = js.native
}

