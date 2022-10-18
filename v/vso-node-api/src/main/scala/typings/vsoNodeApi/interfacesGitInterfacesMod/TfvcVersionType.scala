package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TfvcVersionType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "TfvcVersionType")
@js.native
object TfvcVersionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionType & Double] = js.native
  
  @js.native
  sealed trait Change
    extends StObject
       with TfvcVersionType
  /* 3 */ val Change: typings.vsoNodeApi.interfacesGitInterfacesMod.TfvcVersionType.Change & Double = js.native
  
  @js.native
  sealed trait Changeset
    extends StObject
       with TfvcVersionType
  /* 1 */ val Changeset: typings.vsoNodeApi.interfacesGitInterfacesMod.TfvcVersionType.Changeset & Double = js.native
  
  @js.native
  sealed trait Date
    extends StObject
       with TfvcVersionType
  /* 4 */ val Date: typings.vsoNodeApi.interfacesGitInterfacesMod.TfvcVersionType.Date & Double = js.native
  
  @js.native
  sealed trait Latest
    extends StObject
       with TfvcVersionType
  /* 5 */ val Latest: typings.vsoNodeApi.interfacesGitInterfacesMod.TfvcVersionType.Latest & Double = js.native
  
  @js.native
  sealed trait MergeSource
    extends StObject
       with TfvcVersionType
  /* 7 */ val MergeSource: typings.vsoNodeApi.interfacesGitInterfacesMod.TfvcVersionType.MergeSource & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TfvcVersionType
  /* 0 */ val None: typings.vsoNodeApi.interfacesGitInterfacesMod.TfvcVersionType.None & Double = js.native
  
  @js.native
  sealed trait Shelveset
    extends StObject
       with TfvcVersionType
  /* 2 */ val Shelveset: typings.vsoNodeApi.interfacesGitInterfacesMod.TfvcVersionType.Shelveset & Double = js.native
  
  @js.native
  sealed trait Tip
    extends StObject
       with TfvcVersionType
  /* 6 */ val Tip: typings.vsoNodeApi.interfacesGitInterfacesMod.TfvcVersionType.Tip & Double = js.native
}
