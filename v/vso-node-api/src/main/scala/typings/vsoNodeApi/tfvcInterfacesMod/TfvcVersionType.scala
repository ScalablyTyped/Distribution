package typings.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TfvcVersionType extends StObject
@JSImport("vso-node-api/interfaces/TfvcInterfaces", "TfvcVersionType")
@js.native
object TfvcVersionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionType with Double] = js.native
  
  @js.native
  sealed trait Change extends TfvcVersionType
  /* 3 */ val Change: typings.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.Change with Double = js.native
  
  @js.native
  sealed trait Changeset extends TfvcVersionType
  /* 1 */ val Changeset: typings.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.Changeset with Double = js.native
  
  @js.native
  sealed trait Date extends TfvcVersionType
  /* 4 */ val Date: typings.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.Date with Double = js.native
  
  @js.native
  sealed trait Latest extends TfvcVersionType
  /* 5 */ val Latest: typings.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.Latest with Double = js.native
  
  @js.native
  sealed trait MergeSource extends TfvcVersionType
  /* 7 */ val MergeSource: typings.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.MergeSource with Double = js.native
  
  @js.native
  sealed trait None extends TfvcVersionType
  /* 0 */ val None: typings.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.None with Double = js.native
  
  @js.native
  sealed trait Shelveset extends TfvcVersionType
  /* 2 */ val Shelveset: typings.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.Shelveset with Double = js.native
  
  @js.native
  sealed trait Tip extends TfvcVersionType
  /* 6 */ val Tip: typings.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.Tip with Double = js.native
}
