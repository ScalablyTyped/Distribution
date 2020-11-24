package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseDefinitionExpands extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionExpands")
@js.native
object ReleaseDefinitionExpands extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionExpands with Double] = js.native
  
  @js.native
  sealed trait Artifacts extends ReleaseDefinitionExpands
  /* 4 */ @js.native
  object Artifacts extends TopLevel[Artifacts with Double]
  
  @js.native
  sealed trait Environments extends ReleaseDefinitionExpands
  /* 2 */ @js.native
  object Environments extends TopLevel[Environments with Double]
  
  @js.native
  sealed trait LastRelease extends ReleaseDefinitionExpands
  /* 64 */ @js.native
  object LastRelease extends TopLevel[LastRelease with Double]
  
  @js.native
  sealed trait None extends ReleaseDefinitionExpands
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Tags extends ReleaseDefinitionExpands
  /* 32 */ @js.native
  object Tags extends TopLevel[Tags with Double]
  
  @js.native
  sealed trait Triggers extends ReleaseDefinitionExpands
  /* 8 */ @js.native
  object Triggers extends TopLevel[Triggers with Double]
  
  @js.native
  sealed trait Variables extends ReleaseDefinitionExpands
  /* 16 */ @js.native
  object Variables extends TopLevel[Variables with Double]
}
