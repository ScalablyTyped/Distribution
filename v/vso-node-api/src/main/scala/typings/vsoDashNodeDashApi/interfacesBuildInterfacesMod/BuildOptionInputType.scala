package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuildOptionInputType extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildOptionInputType")
@js.native
object BuildOptionInputType extends js.Object {
  @js.native
  sealed trait Boolean extends BuildOptionInputType
  
  @js.native
  sealed trait BranchFilter extends BuildOptionInputType
  
  @js.native
  sealed trait MultiLine extends BuildOptionInputType
  
  @js.native
  sealed trait PickList extends BuildOptionInputType
  
  @js.native
  sealed trait Radio extends BuildOptionInputType
  
  @js.native
  sealed trait String extends BuildOptionInputType
  
  @js.native
  sealed trait StringList extends BuildOptionInputType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildOptionInputType with Double] = js.native
  /* 1 */ @js.native
  object Boolean extends TopLevel[Boolean with Double]
  
  /* 6 */ @js.native
  object BranchFilter extends TopLevel[BranchFilter with Double]
  
  /* 5 */ @js.native
  object MultiLine extends TopLevel[MultiLine with Double]
  
  /* 4 */ @js.native
  object PickList extends TopLevel[PickList with Double]
  
  /* 3 */ @js.native
  object Radio extends TopLevel[Radio with Double]
  
  /* 0 */ @js.native
  object String extends TopLevel[String with Double]
  
  /* 2 */ @js.native
  object StringList extends TopLevel[StringList with Double]
  
}

