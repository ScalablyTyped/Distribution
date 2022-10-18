package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildOptionInputType extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildOptionInputType")
@js.native
object BuildOptionInputType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildOptionInputType & Double] = js.native
  
  @js.native
  sealed trait Boolean
    extends StObject
       with BuildOptionInputType
  /* 1 */ val Boolean: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildOptionInputType.Boolean & Double = js.native
  
  @js.native
  sealed trait BranchFilter
    extends StObject
       with BuildOptionInputType
  /* 6 */ val BranchFilter: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildOptionInputType.BranchFilter & Double = js.native
  
  @js.native
  sealed trait MultiLine
    extends StObject
       with BuildOptionInputType
  /* 5 */ val MultiLine: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildOptionInputType.MultiLine & Double = js.native
  
  @js.native
  sealed trait PickList
    extends StObject
       with BuildOptionInputType
  /* 4 */ val PickList: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildOptionInputType.PickList & Double = js.native
  
  @js.native
  sealed trait Radio
    extends StObject
       with BuildOptionInputType
  /* 3 */ val Radio: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildOptionInputType.Radio & Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with BuildOptionInputType
  /* 0 */ val String: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildOptionInputType.String & Double = js.native
  
  @js.native
  sealed trait StringList
    extends StObject
       with BuildOptionInputType
  /* 2 */ val StringList: typings.vsoNodeApi.interfacesBuildInterfacesMod.BuildOptionInputType.StringList & Double = js.native
}
