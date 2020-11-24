package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildAuthorizationScope extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildAuthorizationScope")
@js.native
object BuildAuthorizationScope extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildAuthorizationScope with Double] = js.native
  
  /**
    * The identity used should have build service account permissions scoped to the project in which the build definition resides. This is useful for isolation of build jobs to a particular team project to avoid any unintentional escalation of privilege attacks during a build.
    */
  @js.native
  sealed trait Project extends BuildAuthorizationScope
  /* 2 */ @js.native
  object Project extends TopLevel[Project with Double]
  
  /**
    * The identity used should have build service account permissions scoped to the project collection. This is useful when resources for a single build are spread across multiple projects.
    */
  @js.native
  sealed trait ProjectCollection extends BuildAuthorizationScope
  /* 1 */ @js.native
  object ProjectCollection extends TopLevel[ProjectCollection with Double]
}
