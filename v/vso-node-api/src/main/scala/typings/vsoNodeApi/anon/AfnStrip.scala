package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfnStrip extends StObject {
  
  var afnStrip: scala.Double
  
  var bugFilingData: scala.Double
  
  var codeCoverage: scala.Double
  
  var consoleLog: scala.Double
  
  var generalAttachment: scala.Double
  
  var intermediateCollectorData: scala.Double
  
  var runConfig: scala.Double
  
  var testImpactDetails: scala.Double
  
  var tmiTestResultDetail: scala.Double
  
  var tmiTestRunDeploymentFiles: scala.Double
  
  var tmiTestRunReverseDeploymentFiles: scala.Double
  
  var tmiTestRunSummary: scala.Double
}
object AfnStrip {
  
  inline def apply(
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
  
  extension [Self <: AfnStrip](x: Self) {
    
    inline def setAfnStrip(value: scala.Double): Self = StObject.set(x, "afnStrip", value.asInstanceOf[js.Any])
    
    inline def setBugFilingData(value: scala.Double): Self = StObject.set(x, "bugFilingData", value.asInstanceOf[js.Any])
    
    inline def setCodeCoverage(value: scala.Double): Self = StObject.set(x, "codeCoverage", value.asInstanceOf[js.Any])
    
    inline def setConsoleLog(value: scala.Double): Self = StObject.set(x, "consoleLog", value.asInstanceOf[js.Any])
    
    inline def setGeneralAttachment(value: scala.Double): Self = StObject.set(x, "generalAttachment", value.asInstanceOf[js.Any])
    
    inline def setIntermediateCollectorData(value: scala.Double): Self = StObject.set(x, "intermediateCollectorData", value.asInstanceOf[js.Any])
    
    inline def setRunConfig(value: scala.Double): Self = StObject.set(x, "runConfig", value.asInstanceOf[js.Any])
    
    inline def setTestImpactDetails(value: scala.Double): Self = StObject.set(x, "testImpactDetails", value.asInstanceOf[js.Any])
    
    inline def setTmiTestResultDetail(value: scala.Double): Self = StObject.set(x, "tmiTestResultDetail", value.asInstanceOf[js.Any])
    
    inline def setTmiTestRunDeploymentFiles(value: scala.Double): Self = StObject.set(x, "tmiTestRunDeploymentFiles", value.asInstanceOf[js.Any])
    
    inline def setTmiTestRunReverseDeploymentFiles(value: scala.Double): Self = StObject.set(x, "tmiTestRunReverseDeploymentFiles", value.asInstanceOf[js.Any])
    
    inline def setTmiTestRunSummary(value: scala.Double): Self = StObject.set(x, "tmiTestRunSummary", value.asInstanceOf[js.Any])
  }
}
