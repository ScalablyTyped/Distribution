package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildOptionInputType extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildOptionInputType")
@js.native
object BuildOptionInputType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildOptionInputType with Double] = js.native
  
  @js.native
  sealed trait Boolean extends BuildOptionInputType
  /* 1 */ @js.native
  object Boolean extends TopLevel[Boolean with Double]
  
  @js.native
  sealed trait BranchFilter extends BuildOptionInputType
  /* 6 */ @js.native
  object BranchFilter extends TopLevel[BranchFilter with Double]
  
  @js.native
  sealed trait MultiLine extends BuildOptionInputType
  /* 5 */ @js.native
  object MultiLine extends TopLevel[MultiLine with Double]
  
  @js.native
  sealed trait PickList extends BuildOptionInputType
  /* 4 */ @js.native
  object PickList extends TopLevel[PickList with Double]
  
  @js.native
  sealed trait Radio extends BuildOptionInputType
  /* 3 */ @js.native
  object Radio extends TopLevel[Radio with Double]
  
  @js.native
  sealed trait String extends BuildOptionInputType
  /* 0 */ @js.native
  object String extends TopLevel[String with Double]
  
  @js.native
  sealed trait StringList extends BuildOptionInputType
  /* 2 */ @js.native
  object StringList extends TopLevel[StringList with Double]
}
