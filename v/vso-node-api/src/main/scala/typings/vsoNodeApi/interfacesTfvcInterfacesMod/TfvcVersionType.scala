package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TfvcVersionType extends StObject
@JSImport("vso-node-api/interfaces/TfvcInterfaces", "TfvcVersionType")
@js.native
object TfvcVersionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionType & Double] = js.native
  
  @js.native
  sealed trait Change
    extends StObject
       with TfvcVersionType
  /* 3 */ val Change: typings.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcVersionType.Change & Double = js.native
  
  @js.native
  sealed trait Changeset
    extends StObject
       with TfvcVersionType
  /* 1 */ val Changeset: typings.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcVersionType.Changeset & Double = js.native
  
  @js.native
  sealed trait Date
    extends StObject
       with TfvcVersionType
  /* 4 */ val Date: typings.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcVersionType.Date & Double = js.native
  
  @js.native
  sealed trait Latest
    extends StObject
       with TfvcVersionType
  /* 5 */ val Latest: typings.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcVersionType.Latest & Double = js.native
  
  @js.native
  sealed trait MergeSource
    extends StObject
       with TfvcVersionType
  /* 7 */ val MergeSource: typings.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcVersionType.MergeSource & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TfvcVersionType
  /* 0 */ val None: typings.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcVersionType.None & Double = js.native
  
  @js.native
  sealed trait Shelveset
    extends StObject
       with TfvcVersionType
  /* 2 */ val Shelveset: typings.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcVersionType.Shelveset & Double = js.native
  
  @js.native
  sealed trait Tip
    extends StObject
       with TfvcVersionType
  /* 6 */ val Tip: typings.vsoNodeApi.interfacesTfvcInterfacesMod.TfvcVersionType.Tip & Double = js.native
}
