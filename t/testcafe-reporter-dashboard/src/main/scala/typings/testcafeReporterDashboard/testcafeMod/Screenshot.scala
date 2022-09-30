package typings.testcafeReporterDashboard.testcafeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  testRunId :string,   screenshotPath :string,   thumbnailPath :string,   userAgent :string,   quarantineAttempt :number,   takenOnFail :boolean}> */
trait Screenshot extends StObject {
  
  val quarantineAttempt: Double
  
  val screenshotPath: String
  
  val takenOnFail: Boolean
  
  val testRunId: String
  
  val thumbnailPath: String
  
  val userAgent: String
}
object Screenshot {
  
  inline def apply(
    quarantineAttempt: Double,
    screenshotPath: String,
    takenOnFail: Boolean,
    testRunId: String,
    thumbnailPath: String,
    userAgent: String
  ): Screenshot = {
    val __obj = js.Dynamic.literal(quarantineAttempt = quarantineAttempt.asInstanceOf[js.Any], screenshotPath = screenshotPath.asInstanceOf[js.Any], takenOnFail = takenOnFail.asInstanceOf[js.Any], testRunId = testRunId.asInstanceOf[js.Any], thumbnailPath = thumbnailPath.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screenshot]
  }
  
  extension [Self <: Screenshot](x: Self) {
    
    inline def setQuarantineAttempt(value: Double): Self = StObject.set(x, "quarantineAttempt", value.asInstanceOf[js.Any])
    
    inline def setScreenshotPath(value: String): Self = StObject.set(x, "screenshotPath", value.asInstanceOf[js.Any])
    
    inline def setTakenOnFail(value: Boolean): Self = StObject.set(x, "takenOnFail", value.asInstanceOf[js.Any])
    
    inline def setTestRunId(value: String): Self = StObject.set(x, "testRunId", value.asInstanceOf[js.Any])
    
    inline def setThumbnailPath(value: String): Self = StObject.set(x, "thumbnailPath", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
  }
}
