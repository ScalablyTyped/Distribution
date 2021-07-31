package typings.vsoNodeApi

import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.featureManagementInterfacesMod.ContributedFeature
import typings.vsoNodeApi.featureManagementInterfacesMod.ContributedFeatureState
import typings.vsoNodeApi.featureManagementInterfacesMod.ContributedFeatureStateQuery
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureManagementApiMod {
  
  @JSImport("vso-node-api/FeatureManagementApi", "FeatureManagementApi")
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
    def setFeatureState(
      feature: ContributedFeatureState,
      featureId: String,
      userScope: String,
      reason: Unit,
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
    def setFeatureStateForScope(
      feature: ContributedFeatureState,
      featureId: String,
      userScope: String,
      scopeName: String,
      scopeValue: String,
      reason: Unit,
      reasonCode: String
    ): js.Promise[ContributedFeatureState] = js.native
  }
}
