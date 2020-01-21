package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfnStrip extends js.Object {
  var afnStrip: Double
  var bugFilingData: Double
  var codeCoverage: Double
  var consoleLog: Double
  var generalAttachment: Double
  var intermediateCollectorData: Double
  var runConfig: Double
  var testImpactDetails: Double
  var tmiTestResultDetail: Double
  var tmiTestRunDeploymentFiles: Double
  var tmiTestRunReverseDeploymentFiles: Double
  var tmiTestRunSummary: Double
}

object AnonAfnStrip {
  @scala.inline
  def apply(
    afnStrip: Double,
    bugFilingData: Double,
    codeCoverage: Double,
    consoleLog: Double,
    generalAttachment: Double,
    intermediateCollectorData: Double,
    runConfig: Double,
    testImpactDetails: Double,
    tmiTestResultDetail: Double,
    tmiTestRunDeploymentFiles: Double,
    tmiTestRunReverseDeploymentFiles: Double,
    tmiTestRunSummary: Double
  ): AnonAfnStrip = {
    val __obj = js.Dynamic.literal(afnStrip = afnStrip.asInstanceOf[js.Any], bugFilingData = bugFilingData.asInstanceOf[js.Any], codeCoverage = codeCoverage.asInstanceOf[js.Any], consoleLog = consoleLog.asInstanceOf[js.Any], generalAttachment = generalAttachment.asInstanceOf[js.Any], intermediateCollectorData = intermediateCollectorData.asInstanceOf[js.Any], runConfig = runConfig.asInstanceOf[js.Any], testImpactDetails = testImpactDetails.asInstanceOf[js.Any], tmiTestResultDetail = tmiTestResultDetail.asInstanceOf[js.Any], tmiTestRunDeploymentFiles = tmiTestRunDeploymentFiles.asInstanceOf[js.Any], tmiTestRunReverseDeploymentFiles = tmiTestRunReverseDeploymentFiles.asInstanceOf[js.Any], tmiTestRunSummary = tmiTestRunSummary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAfnStrip]
  }
}

