package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuildOptionInputType extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildOptionInputType")
@js.native
object BuildOptionInputType extends js.Object {
  @js.native
  sealed trait Boolean
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildOptionInputType
  
  @js.native
  sealed trait BranchFilter
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildOptionInputType
  
  @js.native
  sealed trait MultiLine
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildOptionInputType
  
  @js.native
  sealed trait PickList
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildOptionInputType
  
  @js.native
  sealed trait Radio
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildOptionInputType
  
  @js.native
  sealed trait String
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildOptionInputType
  
  @js.native
  sealed trait StringList
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildOptionInputType
  
  /* 1 */ val Boolean: Boolean with scala.Double = js.native
  /* 6 */ val BranchFilter: BranchFilter with scala.Double = js.native
  /* 5 */ val MultiLine: MultiLine with scala.Double = js.native
  /* 4 */ val PickList: PickList with scala.Double = js.native
  /* 3 */ val Radio: Radio with scala.Double = js.native
  /* 0 */ val String: String with scala.Double = js.native
  /* 2 */ val StringList: StringList with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildOptionInputType with scala.Double
  ] = js.native
}

