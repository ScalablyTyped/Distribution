package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TfvcVersionType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "TfvcVersionType")
@js.native
object TfvcVersionType extends js.Object {
  @js.native
  sealed trait Change extends TfvcVersionType
  
  @js.native
  sealed trait Changeset extends TfvcVersionType
  
  @js.native
  sealed trait Date extends TfvcVersionType
  
  @js.native
  sealed trait Latest extends TfvcVersionType
  
  @js.native
  sealed trait MergeSource extends TfvcVersionType
  
  @js.native
  sealed trait None extends TfvcVersionType
  
  @js.native
  sealed trait Shelveset extends TfvcVersionType
  
  @js.native
  sealed trait Tip extends TfvcVersionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionType with Double] = js.native
  /* 3 */ @js.native
  object Change
    extends TopLevel[
          typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.TfvcVersionType.Change with Double
        ]
  
  /* 1 */ @js.native
  object Changeset extends TopLevel[Changeset with Double]
  
  /* 4 */ @js.native
  object Date extends TopLevel[Date with Double]
  
  /* 5 */ @js.native
  object Latest extends TopLevel[Latest with Double]
  
  /* 7 */ @js.native
  object MergeSource extends TopLevel[MergeSource with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Shelveset extends TopLevel[Shelveset with Double]
  
  /* 6 */ @js.native
  object Tip extends TopLevel[Tip with Double]
  
}

