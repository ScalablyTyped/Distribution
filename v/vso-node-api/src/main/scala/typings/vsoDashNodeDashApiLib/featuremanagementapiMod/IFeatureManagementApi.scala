package typings
package vsoDashNodeDashApiLib.featuremanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFeatureManagementApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def getFeature(featureId: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeature
  ] = js.native
  def getFeatureState(featureId: java.lang.String, userScope: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureState
  ] = js.native
  def getFeatureStateForScope(
    featureId: java.lang.String,
    userScope: java.lang.String,
    scopeName: java.lang.String,
    scopeValue: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureState
  ] = js.native
  def getFeatures(): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeature
    ]
  ] = js.native
  def getFeatures(targetContributionId: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeature
    ]
  ] = js.native
  def queryFeatureStates(query: vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureStateQuery): js.Promise[
    vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureStateQuery
  ] = js.native
  def queryFeatureStatesForDefaultScope(
    query: vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureStateQuery,
    userScope: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureStateQuery
  ] = js.native
  def queryFeatureStatesForNamedScope(
    query: vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureStateQuery,
    userScope: java.lang.String,
    scopeName: java.lang.String,
    scopeValue: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureStateQuery
  ] = js.native
  def setFeatureState(
    feature: vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureState,
    featureId: java.lang.String,
    userScope: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureState
  ] = js.native
  def setFeatureState(
    feature: vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureState,
    featureId: java.lang.String,
    userScope: java.lang.String,
    reason: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureState
  ] = js.native
  def setFeatureState(
    feature: vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureState,
    featureId: java.lang.String,
    userScope: java.lang.String,
    reason: java.lang.String,
    reasonCode: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureState
  ] = js.native
  def setFeatureStateForScope(
    feature: vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureState,
    featureId: java.lang.String,
    userScope: java.lang.String,
    scopeName: java.lang.String,
    scopeValue: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureState
  ] = js.native
  def setFeatureStateForScope(
    feature: vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureState,
    featureId: java.lang.String,
    userScope: java.lang.String,
    scopeName: java.lang.String,
    scopeValue: java.lang.String,
    reason: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureState
  ] = js.native
  def setFeatureStateForScope(
    feature: vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureState,
    featureId: java.lang.String,
    userScope: java.lang.String,
    scopeName: java.lang.String,
    scopeValue: java.lang.String,
    reason: java.lang.String,
    reasonCode: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureState
  ] = js.native
}

