package typings.testcafeReporterDashboard.libTypesTestcafeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserRunInfo extends StObject {
  
  var actions: js.UndefOr[js.Array[ActionInfo]] = js.undefined
  
  var browser: BrowserInfo
  
  var quarantineAttempt: js.UndefOr[Double] = js.undefined
  
  var screenshotUploadIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var thirdPartyError: js.UndefOr[TestError] = js.undefined
  
  var videoUploadIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var warnings: js.UndefOr[js.Array[Warning]] = js.undefined
}
object BrowserRunInfo {
  
  inline def apply(browser: BrowserInfo): BrowserRunInfo = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserRunInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserRunInfo] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[ActionInfo]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: ActionInfo*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setBrowser(value: BrowserInfo): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setQuarantineAttempt(value: Double): Self = StObject.set(x, "quarantineAttempt", value.asInstanceOf[js.Any])
    
    inline def setQuarantineAttemptUndefined: Self = StObject.set(x, "quarantineAttempt", js.undefined)
    
    inline def setScreenshotUploadIds(value: js.Array[String]): Self = StObject.set(x, "screenshotUploadIds", value.asInstanceOf[js.Any])
    
    inline def setScreenshotUploadIdsUndefined: Self = StObject.set(x, "screenshotUploadIds", js.undefined)
    
    inline def setScreenshotUploadIdsVarargs(value: String*): Self = StObject.set(x, "screenshotUploadIds", js.Array(value*))
    
    inline def setThirdPartyError(value: TestError): Self = StObject.set(x, "thirdPartyError", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyErrorUndefined: Self = StObject.set(x, "thirdPartyError", js.undefined)
    
    inline def setVideoUploadIds(value: js.Array[String]): Self = StObject.set(x, "videoUploadIds", value.asInstanceOf[js.Any])
    
    inline def setVideoUploadIdsUndefined: Self = StObject.set(x, "videoUploadIds", js.undefined)
    
    inline def setVideoUploadIdsVarargs(value: String*): Self = StObject.set(x, "videoUploadIds", js.Array(value*))
    
    inline def setWarnings(value: js.Array[Warning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Warning*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
