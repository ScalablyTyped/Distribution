package typings
package vsoDashNodeDashApiLib.policyApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPolicyApi
  extends vsoDashNodeDashApiLib.clientApiBasesMod.ClientApiBase {
  def createPolicyConfiguration(
    configuration: vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyConfiguration,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyConfiguration] = js.native
  def createPolicyConfiguration(
    configuration: vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyConfiguration,
    project: java.lang.String,
    configurationId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyConfiguration] = js.native
  def deletePolicyConfiguration(project: java.lang.String, configurationId: scala.Double): js.Promise[scala.Unit] = js.native
  def getPolicyConfiguration(project: java.lang.String, configurationId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyConfiguration] = js.native
  def getPolicyConfigurationRevision(project: java.lang.String, configurationId: scala.Double, revisionId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyConfiguration] = js.native
  def getPolicyConfigurationRevisions(project: java.lang.String, configurationId: scala.Double): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyConfiguration]
  ] = js.native
  def getPolicyConfigurationRevisions(project: java.lang.String, configurationId: scala.Double, top: scala.Double): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyConfiguration]
  ] = js.native
  def getPolicyConfigurationRevisions(project: java.lang.String, configurationId: scala.Double, top: scala.Double, skip: scala.Double): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyConfiguration]
  ] = js.native
  def getPolicyConfigurations(project: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyConfiguration]
  ] = js.native
  def getPolicyConfigurations(project: java.lang.String, scope: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyConfiguration]
  ] = js.native
  def getPolicyEvaluation(project: java.lang.String, evaluationId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyEvaluationRecord] = js.native
  def getPolicyEvaluations(project: java.lang.String, artifactId: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyEvaluationRecord]
  ] = js.native
  def getPolicyEvaluations(project: java.lang.String, artifactId: java.lang.String, includeNotApplicable: scala.Boolean): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyEvaluationRecord]
  ] = js.native
  def getPolicyEvaluations(
    project: java.lang.String,
    artifactId: java.lang.String,
    includeNotApplicable: scala.Boolean,
    top: scala.Double
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyEvaluationRecord]
  ] = js.native
  def getPolicyEvaluations(
    project: java.lang.String,
    artifactId: java.lang.String,
    includeNotApplicable: scala.Boolean,
    top: scala.Double,
    skip: scala.Double
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyEvaluationRecord]
  ] = js.native
  def getPolicyType(project: java.lang.String, typeId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyType] = js.native
  def getPolicyTypes(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyType]] = js.native
  def requeuePolicyEvaluation(project: java.lang.String, evaluationId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyEvaluationRecord] = js.native
  def updatePolicyConfiguration(
    configuration: vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyConfiguration,
    project: java.lang.String,
    configurationId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod.PolicyConfiguration] = js.native
}

