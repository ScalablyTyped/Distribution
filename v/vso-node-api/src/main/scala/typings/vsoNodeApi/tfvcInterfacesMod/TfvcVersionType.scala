package typings.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TfvcVersionType extends js.Object
@JSImport("vso-node-api/interfaces/TfvcInterfaces", "TfvcVersionType")
@js.native
object TfvcVersionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionType with Double] = js.native
  
  @js.native
  sealed trait Change extends TfvcVersionType
  /* 3 */ @js.native
  object Change
    extends TopLevel[typings.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.Change with Double]
  
  @js.native
  sealed trait Changeset extends TfvcVersionType
  /* 1 */ @js.native
  object Changeset extends TopLevel[Changeset with Double]
  
  @js.native
  sealed trait Date extends TfvcVersionType
  /* 4 */ @js.native
  object Date extends TopLevel[Date with Double]
  
  @js.native
  sealed trait Latest extends TfvcVersionType
  /* 5 */ @js.native
  object Latest extends TopLevel[Latest with Double]
  
  @js.native
  sealed trait MergeSource extends TfvcVersionType
  /* 7 */ @js.native
  object MergeSource extends TopLevel[MergeSource with Double]
  
  @js.native
  sealed trait None extends TfvcVersionType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Shelveset extends TfvcVersionType
  /* 2 */ @js.native
  object Shelveset extends TopLevel[Shelveset with Double]
  
  @js.native
  sealed trait Tip extends TfvcVersionType
  /* 6 */ @js.native
  object Tip extends TopLevel[Tip with Double]
}
