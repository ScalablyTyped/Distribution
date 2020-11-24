package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitPathActions extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitPathActions")
@js.native
object GitPathActions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPathActions with Double] = js.native
  
  @js.native
  sealed trait Add extends GitPathActions
  /* 3 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  @js.native
  sealed trait Delete extends GitPathActions
  /* 2 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  @js.native
  sealed trait Edit extends GitPathActions
  /* 1 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  @js.native
  sealed trait None extends GitPathActions
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Rename extends GitPathActions
  /* 4 */ @js.native
  object Rename extends TopLevel[Rename with Double]
}
