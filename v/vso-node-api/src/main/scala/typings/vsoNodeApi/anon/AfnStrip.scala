package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfnStrip extends js.Object {
  
  var afnStrip: scala.Double = js.native
  
  var bugFilingData: scala.Double = js.native
  
  var codeCoverage: scala.Double = js.native
  
  var consoleLog: scala.Double = js.native
  
  var generalAttachment: scala.Double = js.native
  
  var intermediateCollectorData: scala.Double = js.native
  
  var runConfig: scala.Double = js.native
  
  var testImpactDetails: scala.Double = js.native
  
  var tmiTestResultDetail: scala.Double = js.native
  
  var tmiTestRunDeploymentFiles: scala.Double = js.native
  
  var tmiTestRunReverseDeploymentFiles: scala.Double = js.native
  
  var tmiTestRunSummary: scala.Double = js.native
}
object AfnStrip {
  
  @scala.inline
  def apply(
    afnStrip: scala.Double,
    bugFilingData: scala.Double,
    codeCoverage: scala.Double,
    consoleLog: scala.Double,
    generalAttachment: scala.Double,
    intermediateCollectorData: scala.Double,
    runConfig: scala.Double,
    testImpactDetails: scala.Double,
    tmiTestResultDetail: scala.Double,
    tmiTestRunDeploymentFiles: scala.Double,
    tmiTestRunReverseDeploymentFiles: scala.Double,
    tmiTestRunSummary: scala.Double
  ): AfnStrip = {
    val __obj = js.Dynamic.literal(afnStrip = afnStrip.asInstanceOf[js.Any], bugFilingData = bugFilingData.asInstanceOf[js.Any], codeCoverage = codeCoverage.asInstanceOf[js.Any], consoleLog = consoleLog.asInstanceOf[js.Any], generalAttachment = generalAttachment.asInstanceOf[js.Any], intermediateCollectorData = intermediateCollectorData.asInstanceOf[js.Any], runConfig = runConfig.asInstanceOf[js.Any], testImpactDetails = testImpactDetails.asInstanceOf[js.Any], tmiTestResultDetail = tmiTestResultDetail.asInstanceOf[js.Any], tmiTestRunDeploymentFiles = tmiTestRunDeploymentFiles.asInstanceOf[js.Any], tmiTestRunReverseDeploymentFiles = tmiTestRunReverseDeploymentFiles.asInstanceOf[js.Any], tmiTestRunSummary = tmiTestRunSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfnStrip]
  }
  
  @scala.inline
  implicit class AfnStripOps[Self <: AfnStrip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfnStrip(value: scala.Double): Self = this.set("afnStrip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBugFilingData(value: scala.Double): Self = this.set("bugFilingData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeCoverage(value: scala.Double): Self = this.set("codeCoverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsoleLog(value: scala.Double): Self = this.set("consoleLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneralAttachment(value: scala.Double): Self = this.set("generalAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntermediateCollectorData(value: scala.Double): Self = this.set("intermediateCollectorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunConfig(value: scala.Double): Self = this.set("runConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestImpactDetails(value: scala.Double): Self = this.set("testImpactDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmiTestResultDetail(value: scala.Double): Self = this.set("tmiTestResultDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmiTestRunDeploymentFiles(value: scala.Double): Self = this.set("tmiTestRunDeploymentFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmiTestRunReverseDeploymentFiles(value: scala.Double): Self = this.set("tmiTestRunReverseDeploymentFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmiTestRunSummary(value: scala.Double): Self = this.set("tmiTestRunSummary", value.asInstanceOf[js.Any])
  }
}
