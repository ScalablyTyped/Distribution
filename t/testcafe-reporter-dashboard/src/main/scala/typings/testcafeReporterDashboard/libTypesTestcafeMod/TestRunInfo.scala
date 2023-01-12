package typings.testcafeReporterDashboard.libTypesTestcafeMod

import typings.testcafeReporterDashboard.anon.BrowserInfotestRunIdstrin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRunInfo extends StObject {
  
  var browsers: js.Array[BrowserInfotestRunIdstrin]
  
  var durationMs: Double
  
  var errs: js.Array[Error]
  
  var quarantine: Quarantine | Null
  
  var screenshotPath: String | Null
  
  var screenshots: js.Array[Screenshot]
  
  var skipped: Boolean
  
  var testId: String
  
  var unstable: Boolean
  
  var videos: js.Array[Video]
  
  var warnings: js.Array[String]
}
object TestRunInfo {
  
  inline def apply(
    browsers: js.Array[BrowserInfotestRunIdstrin],
    durationMs: Double,
    errs: js.Array[Error],
    screenshots: js.Array[Screenshot],
    skipped: Boolean,
    testId: String,
    unstable: Boolean,
    videos: js.Array[Video],
    warnings: js.Array[String]
  ): TestRunInfo = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], durationMs = durationMs.asInstanceOf[js.Any], errs = errs.asInstanceOf[js.Any], screenshots = screenshots.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any], unstable = unstable.asInstanceOf[js.Any], videos = videos.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], quarantine = null, screenshotPath = null)
    __obj.asInstanceOf[TestRunInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestRunInfo] (val x: Self) extends AnyVal {
    
    inline def setBrowsers(value: js.Array[BrowserInfotestRunIdstrin]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    inline def setBrowsersVarargs(value: BrowserInfotestRunIdstrin*): Self = StObject.set(x, "browsers", js.Array(value*))
    
    inline def setDurationMs(value: Double): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    inline def setErrs(value: js.Array[Error]): Self = StObject.set(x, "errs", value.asInstanceOf[js.Any])
    
    inline def setErrsVarargs(value: Error*): Self = StObject.set(x, "errs", js.Array(value*))
    
    inline def setQuarantine(value: Quarantine): Self = StObject.set(x, "quarantine", value.asInstanceOf[js.Any])
    
    inline def setQuarantineNull: Self = StObject.set(x, "quarantine", null)
    
    inline def setScreenshotPath(value: String): Self = StObject.set(x, "screenshotPath", value.asInstanceOf[js.Any])
    
    inline def setScreenshotPathNull: Self = StObject.set(x, "screenshotPath", null)
    
    inline def setScreenshots(value: js.Array[Screenshot]): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
    
    inline def setScreenshotsVarargs(value: Screenshot*): Self = StObject.set(x, "screenshots", js.Array(value*))
    
    inline def setSkipped(value: Boolean): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    
    inline def setUnstable(value: Boolean): Self = StObject.set(x, "unstable", value.asInstanceOf[js.Any])
    
    inline def setVideos(value: js.Array[Video]): Self = StObject.set(x, "videos", value.asInstanceOf[js.Any])
    
    inline def setVideosVarargs(value: Video*): Self = StObject.set(x, "videos", js.Array(value*))
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
