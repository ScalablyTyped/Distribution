package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands.Artifacts
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands.Environments
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands.LastRelease
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands.None
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands.Tags
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands.Triggers
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseDefinitionExpands extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionExpands")
@js.native
object ReleaseDefinitionExpands extends js.Object {
  @js.native
  sealed trait Artifacts extends ReleaseDefinitionExpands
  
  @js.native
  sealed trait Environments extends ReleaseDefinitionExpands
  
  @js.native
  sealed trait LastRelease extends ReleaseDefinitionExpands
  
  @js.native
  sealed trait None extends ReleaseDefinitionExpands
  
  @js.native
  sealed trait Tags extends ReleaseDefinitionExpands
  
  @js.native
  sealed trait Triggers extends ReleaseDefinitionExpands
  
  @js.native
  sealed trait Variables extends ReleaseDefinitionExpands
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionExpands with Double] = js.native
  /* 4 */ @js.native
  object Artifacts extends TopLevel[Artifacts with Double]
  
  /* 2 */ @js.native
  object Environments extends TopLevel[Environments with Double]
  
  /* 64 */ @js.native
  object LastRelease extends TopLevel[LastRelease with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 32 */ @js.native
  object Tags extends TopLevel[Tags with Double]
  
  /* 8 */ @js.native
  object Triggers extends TopLevel[Triggers with Double]
  
  /* 16 */ @js.native
  object Variables extends TopLevel[Variables with Double]
  
}

