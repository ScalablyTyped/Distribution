package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuildAuthorizationScope extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildAuthorizationScope")
@js.native
object BuildAuthorizationScope extends js.Object {
  /**
    * The identity used should have build service account permissions scoped to the project in which the build definition resides. This is useful for isolation of build jobs to a particular team project to avoid any unintentional escalation of privilege attacks during a build.
    */
  @js.native
  sealed trait Project extends BuildAuthorizationScope
  
  /**
    * The identity used should have build service account permissions scoped to the project collection. This is useful when resources for a single build are spread across multiple projects.
    */
  @js.native
  sealed trait ProjectCollection extends BuildAuthorizationScope
  
  /* 2 */ val Project: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildAuthorizationScope.Project with Double = js.native
  /* 1 */ val ProjectCollection: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildAuthorizationScope.ProjectCollection with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildAuthorizationScope with Double] = js.native
}

