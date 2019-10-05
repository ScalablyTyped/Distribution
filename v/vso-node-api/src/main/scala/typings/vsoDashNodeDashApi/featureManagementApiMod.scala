package typings.vsoDashNodeDashApi

import typings.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typings.vsoDashNodeDashApi.featureManagementApiMod.IFeatureManagementApi
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoDashNodeDashApi.interfacesFeatureManagementInterfacesMod.ContributedFeature
import typings.vsoDashNodeDashApi.interfacesFeatureManagementInterfacesMod.ContributedFeatureState
import typings.vsoDashNodeDashApi.interfacesFeatureManagementInterfacesMod.ContributedFeatureStateQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/FeatureManagementApi", JSImport.Namespace)
@js.native
object featureManagementApiMod extends js.Object {
  @js.native
  class FeatureManagementApi protected () extends IFeatureManagementApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait IFeatureManagementApi extends ClientApiBase {
    def getFeature(featureId: String): js.Promise[ContributedFeature] = js.native
    def getFeatureState(featureId: String, userScope: String): js.Promise[ContributedFeatureState] = js.native
    def getFeatureStateForScope(featureId: String, userScope: String, scopeName: String, scopeValue: String): js.Promise[ContributedFeatureState] = js.native
    def getFeatures(): js.Promise[js.Array[ContributedFeature]] = js.native
    def getFeatures(targetContributionId: String): js.Promise[js.Array[ContributedFeature]] = js.native
    def queryFeatureStates(query: ContributedFeatureStateQuery): js.Promise[ContributedFeatureStateQuery] = js.native
    def queryFeatureStatesForDefaultScope(query: ContributedFeatureStateQuery, userScope: String): js.Promise[ContributedFeatureStateQuery] = js.native
    def queryFeatureStatesForNamedScope(query: ContributedFeatureStateQuery, userScope: String, scopeName: String, scopeValue: String): js.Promise[ContributedFeatureStateQuery] = js.native
    def setFeatureState(feature: ContributedFeatureState, featureId: String, userScope: String): js.Promise[ContributedFeatureState] = js.native
    def setFeatureState(feature: ContributedFeatureState, featureId: String, userScope: String, reason: String): js.Promise[ContributedFeatureState] = js.native
    def setFeatureState(
      feature: ContributedFeatureState,
      featureId: String,
      userScope: String,
      reason: String,
      reasonCode: String
    ): js.Promise[ContributedFeatureState] = js.native
    def setFeatureStateForScope(
      feature: ContributedFeatureState,
      featureId: String,
      userScope: String,
      scopeName: String,
      scopeValue: String
    ): js.Promise[ContributedFeatureState] = js.native
    def setFeatureStateForScope(
      feature: ContributedFeatureState,
      featureId: String,
      userScope: String,
      scopeName: String,
      scopeValue: String,
      reason: String
    ): js.Promise[ContributedFeatureState] = js.native
    def setFeatureStateForScope(
      feature: ContributedFeatureState,
      featureId: String,
      userScope: String,
      scopeName: String,
      scopeValue: String,
      reason: String,
      reasonCode: String
    ): js.Promise[ContributedFeatureState] = js.native
  }
  
}

